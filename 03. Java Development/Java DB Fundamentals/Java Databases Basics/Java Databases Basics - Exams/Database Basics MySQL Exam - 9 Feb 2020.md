**01.	Table Design**
``` SQL
CREATE TABLE `coaches` (
	`id` INT(11) Primary Key AUTO_INCREMENT,
    `first_name` VARCHAR(10) NOT NULL,
    `last_name` VARCHAR(20) NOT NULL,
    `salary` DECIMAL(10,2) NOT NULL DEFAULT 0,
    `coach_level` INT(11) NOT NULL DEFAULT 0
);

CREATE TABLE `countries` (
    `id` INT(11) Primary Key AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL
);

CREATE TABLE `towns` (
	`id` INT(11) Primary Key AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    `country_id` INT(11) NOT NULL
);

CREATE TABLE `players_coaches` (
	`player_id` INT(11),
    `coach_id` INT(11)
);

CREATE TABLE `players` (
	`id` INT(11) Primary Key AUTO_INCREMENT,
    `first_name` VARCHAR(10) NOT NULL,
    `last_name` VARCHAR(20) NOT NULL,
    `age` INT(11) NOT NULL DEFAULT 0,
    `position` CHAR(1) NOT NULL,
    `salary` DECIMAL(10,2) NOT NULL DEFAULT 0,
    `hire_date` DATETIME,
    `skills_data_id` INT(11) NOT NULL,
    `team_id` INT(11) NULL
);

CREATE TABLE `stadiums` (
	`id` INT(11) Primary Key AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    `capacity` INT(11) NOT NULL,
    `town_id` INT(11) NOT NULL
);

CREATE TABLE `skills_data` (
	`id` INT(11) Primary Key AUTO_INCREMENT,
    `dribbling` INT(11) DEFAULT 0,
    `pace` INT(11) DEFAULT 0,
    `passing` INT(11) DEFAULT 0,
    `shooting` INT(11) DEFAULT 0,
    `speed` INT(11) DEFAULT 0,
    `strength` INT(11) DEFAULT 0
);

CREATE TABLE `teams` (
	`id` INT(11) Primary Key AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    `established` DATE NOT NULL,
    `fan_base` BIGINT(20) NOT NULL DEFAULT 0,
    `stadium_id` INT(11) NOT NULL
);

ALTER TABLE `players_coaches` 

ADD CONSTRAINT `pk_players_coaches`
PRIMARY KEY (`player_id`, `coach_id`),

ADD CONSTRAINT `fk_players_coaches_coaches`
FOREIGN KEY (`coach_id`)
REFERENCES `coaches`(`id`),

ADD CONSTRAINT `fk_players_coaches_players`
FOREIGN KEY (`player_id`)
REFERENCES `players`(`id`);

ALTER TABLE `players` 

ADD CONSTRAINT `fk_players_skills_data`
FOREIGN KEY (`skills_data_id`)
REFERENCES `skills_data`(`id`),

ADD CONSTRAINT `fk_players_teams`
FOREIGN KEY (`team_id`)
REFERENCES `teams`(`id`);

ALTER TABLE `stadiums` 

ADD CONSTRAINT `fk_stadiums_towns`
FOREIGN KEY (`town_id`)
REFERENCES `towns`(`id`);

ALTER TABLE `towns` 

ADD CONSTRAINT `fk_towns_countries`
FOREIGN KEY (`country_id`)
REFERENCES `countries`(`id`);

ALTER TABLE `teams` 

ADD CONSTRAINT `fk_teams_stadiums`
FOREIGN KEY (`stadium_id`)
REFERENCES `stadiums`(`id`);
```
**02.	Insert**
``` SQL
INSERT INTO `coaches` (`first_name`, `last_name`, `salary`, `coach_level`)
SELECT `first_name`, `last_name`, `salary`, CHAR_LENGTH(`first_name`) FROM `players`
WHERE `age` >= 45;
```
**03.	Update**
``` SQL
UPDATE `coaches` AS `c`
RIGHT JOIN `players_coaches` AS `pc` ON `c`.`id` = `pc`.`coach_id`
SET `c`.`coach_level` = `c`.`coach_level` + 1
WHERE `c`.`id` IS NOT NULL AND LEFT(`c`.`first_name`, 1) = 'A';
```
**04.	Delete**
``` SQL
DELETE FROM `players`
WHERE `age` >= 45;
```
**05.	Players**
``` SQL
SELECT `first_name`, `age`, `salary` FROM players
ORDER BY `salary` DESC;
```
**06.	Young offense players without contract**
``` SQL
SELECT `p`.`id`, CONCAT(`p`.`first_name`, ' ', `p`.`last_name`) AS 'full_name', `p`.`age`, `p`.`position`, `p`.`hire_date` 
FROM `players` AS `p`
JOIN `skills_data` AS `sd` ON `sd`.`id` = `p`.`skills_data_id`
WHERE `p`.`age` <=22 AND `p`.`position` = 'A' AND `p`.`hire_date` IS NULL AND `sd`.`strength` >= 50
ORDER BY `salary`, `age`;
```
**07.	Detail info for all teams**
``` SQL
SELECT `t`.`name` AS 'team_name', `established`, `fan_base`, COUNT(`p`.`team_id`) AS 'players_count' 
FROM `teams` AS `t`
LEFT JOIN `players` AS `p` ON `p`.`team_id` = `t`.`id`
GROUP BY `t`.`id`
ORDER BY `players_count` DESC, `fan_base` DESC;
```
**08.	The fastest player by towns**
``` SQL
SELECT MAX(`sd`.`speed`) AS 'max_speed', `tw`.`name` AS 'town_name' FROM `players` AS `p`
RIGHT JOIN `skills_data` AS `sd` ON `p`.`skills_data_id` = `sd`.`id`
RIGHT JOIN `teams` AS `t` ON `p`.`team_id` = `t`.`id`
RIGHT JOIN `stadiums` AS `s` ON `s`.`id` = `t`.`stadium_id`
RIGHT JOIN `towns` AS `tw` ON `tw`.`id` = `s`.`town_id`
WHERE `t`.`name` != 'Devify'
GROUP BY `tw`.`name`
ORDER BY `max_speed` DESC, `tw`.`name`;
```
**09.	Total salaries and players by country**
``` SQL
SELECT `c`.`name` AS 'country_name', 
COUNT(`p`.`id`) AS 'total_count_of_players',
SUM(`p`.`salary`) AS 'total_sum_of_salaries'
FROM `countries` AS `c` 
LEFT JOIN `towns` AS `tw` ON `tw`.`country_id` = `c`.`id`
LEFT JOIN `stadiums` AS `s` ON `s`.`town_id` = `tw`.`id`
LEFT JOIN `teams` AS `t` ON `t`.`stadium_id` = `s`.`id`
LEFT JOIN `players` AS `p` ON `p`.`team_id` = `t`.`id`
GROUP BY `country_name`
ORDER BY `total_count_of_players` DESC, `country_name`;
```
**10.	Find all players that play on stadium**
``` SQL
CREATE FUNCTION `udf_stadium_players_count`(`stadium_name` VARCHAR(30)) 
RETURNS INTEGER
BEGIN
RETURN (SELECT COUNT(*) FROM `players` AS `p`
JOIN `teams` AS `t` ON `t`.`id` = `p`.`team_id`
JOIN `stadiums` AS `s` ON `s`.`id` = `t`.`stadium_id`
WHERE `s`.`name` = `stadium_name`);
END
```
**11.	Find good playmaker by teams**
``` SQL
CREATE PROCEDURE `udp_find_playmaker`(`min_dribble_points` INT, `team_name` VARCHAR(45))
BEGIN
	SELECT CONCAT(`p`.`first_name`, ' ', `p`.`last_name`) AS 'full_name',
	`p`.`age`, `p`.`salary`, `sd`.`dribbling`, `sd`.`speed`, `team_name`
	FROM `players` AS `p`
	JOIN `skills_data` AS `sd` ON `sd`.`id` = `p`.`skills_data_id`
	JOIN `teams` AS `t` ON `t`.`id` = `p`.`team_id`
	WHERE `sd`.`dribbling` >= min_dribble_points AND `t`.`name` = `team_name` AND 
    `sd`.`speed` > (SELECT AVG(`sd`.`speed`) FROM `skills_data` AS `sd`)
	ORDER BY `sd`.`speed` DESC LIMIT 1;
END
```