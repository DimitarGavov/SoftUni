**01.	Table Design**
``` SQL
CREATE TABLE `branches` (
	`id` INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(30) NOT NULL UNIQUE
);

CREATE TABLE `employees` (
	`id` INT PRIMARY KEY AUTO_INCREMENT,
    `first_name` VARCHAR(20) NOT NULL,
    `last_name` VARCHAR(20) NOT NULL,
    `salary` DECIMAL(10, 2) NOT NULL,
    `started_on` DATE NOT NULL,
    `branch_id` INT NOT NULL
);

CREATE TABLE `clients` (
	`id` INT PRIMARY KEY AUTO_INCREMENT,
    `full_name` VARCHAR(50) NOT NULL,
    `age` INT NOT NULL
);

CREATE TABLE `employees_clients` (
	`employee_id` INT,
    `client_id` INT
);

CREATE TABLE `bank_accounts` (
	`id` INT PRIMARY KEY AUTO_INCREMENT,
    `account_number` VARCHAR(10) NOT NULL,
    `balance` DECIMAL(10, 2) NOT NULL,
    `client_id` INT NOT NULL UNIQUE
);

CREATE TABLE `cards` (
	`id` INT PRIMARY KEY AUTO_INCREMENT,
    `card_number` VARCHAR(19) NOT NULL,
    `card_status` VARCHAR(7) NOT NULL,
    `bank_account_id` INT NOT NULL
);

ALTER TABLE `employees`

ADD CONSTRAINT `fk_employees_branches`
FOREIGN KEY (`branch_id`)
REFERENCES `branches`(`id`);

ALTER TABLE `employees_clients`

ADD CONSTRAINT `fk_employees_clients_employees`
FOREIGN KEY (`employee_id`)
REFERENCES `employees`(`id`),

ADD CONSTRAINT `fk_employees_clients_clients`
FOREIGN KEY (`client_id`)
REFERENCES `clients`(`id`);

ALTER TABLE `bank_accounts`

ADD CONSTRAINT `fk_bank_accounts_clients`
FOREIGN KEY (`client_id`)
REFERENCES `clients`(`id`);

ALTER TABLE `cards`

ADD CONSTRAINT `fk_cards_bank_accounts`
FOREIGN KEY (`bank_account_id`)
REFERENCES `bank_accounts`(`id`);
```
**02.	Insert**
``` SQL
INSERT INTO `cards` (`card_number`, `card_status`, `bank_account_id`)
SELECT REVERSE(`clients`.`full_name`), 'Active', `id` FROM `clients`
WHERE `clients`.`id` BETWEEN 191 AND 200
```
**03.	Update**
``` SQL
UPDATE `employees_clients` AS `ec`
SET `ec`.`employee_id` = (SELECT `ec1`.`employee_id` FROM 
(SELECT `ec2`.`employee_id`, `ec2`.`client_id` FROM `employees_clients` AS `ec2` ) AS `ec1`
GROUP BY `ec1`.`employee_id`
ORDER BY COUNT(`ec1`.`client_id`), `ec1`.`employee_id` Limit 1)
WHERE `employee_id` = `client_id`
```
**04.	Delete**
``` SQL
DELETE `e` FROM `employees` AS `e`
LEFT JOIN `employees_clients` AS `ec` ON `ec`.`employee_id` = `e`.`id`
WHERE `ec`.`client_id` IS NULL
```
**05.	Clients**
``` SQL
SELECT `id`, `full_name` FROM `clients`
ORDER BY `id` ASC;
```
**06.	Newbies**
``` SQL
SELECT `id`, CONCAT(`first_name`, ' ', `last_name`) AS 'full_name', CONCAT('$', `salary`), `started_on` FROM `employees`
WHERE `salary` >= 100000 AND `started_on` >= '2018/01/01'
ORDER BY `salary` DESC, `id`;
```
**07.	Cards against Humanity**
``` SQL
SELECT `c`.`id`, CONCAT(`c`.`card_number`, ' : ', `cl`.`full_name`) AS 'card_token' FROM `cards` AS `c`
JOIN `bank_accounts` AS `ba` ON `ba`.`id` = `c`.`bank_account_id`
JOIN `clients` AS `cl` ON `cl`.`id` = `ba`.`client_id`
ORDER BY `c`.`id` DESC;
```
**08.	Top 5 Employees**
``` SQL
SELECT CONCAT(`e`.`first_name`, ' ', `e`.`last_name`) AS 'name', 
`e`.`started_on`, COUNT(`ec`.`client_id`) AS 'count_of_clients'
FROM `employees` AS `e`
JOIN `employees_clients` AS `ec` ON `ec`.`employee_id` = `e`.`id`
GROUP BY `ec`.`employee_id`
ORDER BY `count_of_clients` DESC, `ec`.`employee_id` LIMIT 5
```
**09.	Branch cards**
``` SQL
SELECT `b`.`name` AS 'name', COUNT(`c`.`id`) AS 'count_of_cards' 
FROM `branches` AS `b`
LEFT JOIN `employees` AS `e` ON `b`.`id` = `e`.`branch_id`
LEFT JOIN `employees_clients` AS `ec` ON `e`.`id` = `ec`.`employee_id`
LEFT JOIN `clients` AS `cl` ON `cl`.`id` = `ec`.`client_id`
LEFT JOIN `bank_accounts` AS `ba` ON `ba`.`client_id` = `cl`.`id`
LEFT JOIN `cards` AS `c` ON `c`.`bank_account_id` = `ba`.`id`
GROUP BY `b`.`name`
ORDER BY `count_of_cards` DESC, `name`;
```
**10.	Extract client cards count**
``` SQL
CREATE FUNCTION `udf_client_cards_count`(`client_full_name` VARCHAR(30)) RETURNS int
BEGIN
RETURN	(SELECT COUNT(*) FROM `clients` AS `cl`
	LEFT JOIN `bank_accounts` AS `ba` ON `ba`.`client_id` = `cl`.`id`
	LEFT JOIN `cards` AS `c` ON `c`.`bank_account_id` = `ba`.`id`
	WHERE `cl`.`full_name` = `client_full_name`);
END
```
**11.	Extract Client Info**
``` SQL
CREATE PROCEDURE `udp_clientinfo` (`client_full_name` VARCHAR(50))
BEGIN
	SELECT `cl`.`full_name` AS 'full_name',
	`cl`.`age` AS 'age', 
	`ba`.`account_number` AS 'account_number', 
	CONCAT('$', `ba`.`balance`) AS 'balance'
	FROM `clients` AS `cl`
	JOIN `bank_accounts` AS `ba` ON `ba`.`client_id` = `cl`.`id`
	WHERE `full_name` = `client_full_name`;
END
```