**1.	Table Design**
``` SQL
CREATE TABLE `users` (
	`id` INT Primary Key AUTO_INCREMENT,
    `username` VARCHAR(30) NOT NULL UNIQUE,
    `password` VARCHAR(30) NOT NULL,
    `email` VARCHAR(50) NOT NULL
);

CREATE TABLE `categories` (
	`id` INT Primary Key AUTO_INCREMENT,
    `category` VARCHAR(30) NOT NULL
);

CREATE TABLE `articles` (
	`id` INT(11) Primary Key AUTO_INCREMENT,
    `title` VARCHAR(50) NOT NULL,
    `content` TEXT NOT NULL,
    `category_id` INT
);

CREATE TABLE `users_articles` (
	`user_id` INT,
    `article_id` INT
);

CREATE TABLE `comments` (
	`id` INT Primary Key AUTO_INCREMENT,
    `comment` VARCHAR(255) NOT NULL,
    `article_id` INT NOT NULL,
    `user_id` INT NOT NULL
);

CREATE TABLE `likes` (
	`id` INT(11) Primary Key AUTO_INCREMENT,
    `article_id` INT(11),
    `comment_id` INT(11),
    `user_id` INT(11) NOT NULL
);

ALTER TABLE `comments`

ADD CONSTRAINT `fk_comments_users`
FOREIGN KEY (`user_id`)
REFERENCES `users`(`id`),

ADD CONSTRAINT `fk_comments_articles`
FOREIGN KEY (`article_id`)
REFERENCES `articles`(`id`);

ALTER TABLE `likes`

ADD CONSTRAINT `fk_likes_comments`
FOREIGN KEY (`comment_id`)
REFERENCES `comments`(`id`),

ADD CONSTRAINT `fk_likes_users`
FOREIGN KEY (`user_id`)
REFERENCES `users`(`id`),

ADD CONSTRAINT `fk_likes_articles`
FOREIGN KEY (`article_id`)
REFERENCES `articles`(`id`);

ALTER TABLE `articles`

ADD CONSTRAINT `fk_articles_categories`
FOREIGN KEY (`category_id`)
REFERENCES `categories`(`id`);

ALTER TABLE `users_articles`

ADD CONSTRAINT `fk_users_articles_users`
FOREIGN KEY (`user_id`)
REFERENCES `users`(`id`),

ADD CONSTRAINT `fk_users_articles_articles`
FOREIGN KEY (`article_id`)
REFERENCES `articles`(`id`);
```
**2.	Data Insertion**
``` SQL
INSERT INTO `likes` (`article_id`, `comment_id`, `user_id`)
SELECT 
IF(`u`.`id` % 2 = 0, CHAR_LENGTH(`u`.`username`), NULL),
IF(`u`.`id` % 2 = 1, CHAR_LENGTH(`u`.`email`), NULL),
`u`.`id` FROM `users` AS `u`
WHERE `u`.`id` BETWEEN 16 AND 20; 
```
**3.	Data Update**
``` SQL
UPDATE `comments` AS `c`
SET `c`.`comment` = (
	CASE
		WHEN `c`.`id` % 2 = 0 THEN 'Very good article.'
		WHEN `c`.`id` % 3 = 0 THEN 'This is interesting.'
		WHEN `c`.`id` % 5 = 0 THEN 'I definitely will read the article again.'
		WHEN `c`.`id` % 7 = 0 THEN 'The universe is such an amazing thing.'
        ELSE `c`.`comment`
    END
)
WHERE `c`.`id` BETWEEN 1 AND 15;
```
**4.	Data Deletion**
``` SQL
DELETE FROM articles
WHERE `category_id` IS NULL;
```
**5.	Extract 3 biggest articles**
``` SQL
SELECT nt.title, nt.summary
FROM (Select a.id, a.title, 
concat(left(a.content, 20), '...') as 'summary'
 from `articles` AS a
ORDER BY char_length(a.content) desc
LIMIT 3) AS nt
ORDER BY nt.id;
```
**6.	Golden Articles**
``` SQL
SELECT a.id, a.title FROM articles AS a
JOIN `users_articles` AS ua ON a.id = ua.article_id
WHERE ua.user_id = ua.article_id;
```
**7.	Extract categories**
``` SQL
select c.category, 
COUNT( distinct a.id) AS 'a_count', 
COUNT( distinct l.id) AS 'l_count' from categories AS c
LEFT JOIN articles AS a ON c.id = a.category_id
LEFT JOIN likes AS l ON l.article_id = a.id
GROUP BY c.category
ORDER BY `l_count` DESC, `a_count` DESC, c.id;
```
**8.	Extract the most commented Social article**
``` SQL
SELECT a.title, count(com.id) AS 'c_count' FROM articles AS a
JOIN categories as c ON c.id = a.category_id
JOIN comments AS com ON com.article_id = a.id
WHERE c.category = 'Social'
GROUP BY a.id
ORDER BY c_count DESC LIMIT 1;
```
**9.	Extract the less liked comments**
``` SQL
SELECT CONCAT(LEFT(`com`.`comment`, 20), '...') AS 'summary' FROM `comments` AS `com`
left JOIN `likes` AS `l` ON `l`.`comment_id` = `com`.`id`
WHERE `l`.`comment_id` IS NULL
ORDER BY `com`.`id` DESC;
```
**10.	Get user’s articles count**
``` SQL
CREATE FUNCTION `udf_users_articles_count`(usrnm VARCHAR(30)) RETURNS int
BEGIN
	RETURN (SELECT COUNT(`ua`.`article_id`) AS 'article_count' FROM `users_articles` AS `ua`
		RIGHT JOIN `users` AS `u` ON `u`.`id` = `ua`.`user_id`
	WHERE `u`.`username` = usrnm);
END
```
**11.	Like article**
``` SQL
CREATE PROCEDURE `udp_like_article` (p_username VARCHAR(30), p_title VARCHAR(30))
BEGIN
	IF ((Select count(*) FROM users AS u WHERE u.username = p_username) = 0)
    THEN SIGNAL sqlstate '45000' SEt message_text = 'Non-existent user.';
    ROLLBACK;
    ELSEIF ((Select count(*) FROM articles AS a WHERE a.title = p_title) = 0)
    THEN SIGNAL sqlstate '45000' SEt message_text = 'Non-existent article.';
    ROLLBACK;
    ELSE
    insert into likes(article_id, comment_id, user_id)
    SELECT 
    (SELECT id FROM articles WHERE title = p_title),
    NULL,
    (SELECT id FROM users WHERE username = p_username);
    end if;
END
```