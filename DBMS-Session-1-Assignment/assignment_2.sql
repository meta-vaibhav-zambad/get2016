/*Qu: Write a command to display all the table names present in LIS.*/

USE Library;

SHOW TABLES;

/* Qu: Alter definitions */

ALTER TABLE Book_Issue ALTER issue_date SET DEFAULT '2016-08-10';

DESCRIBE Book_Issue; 

ALTER TABLE Book_Issue ALTER due_date SET DEFAULT '2016-08-30';

DESCRIBE Book_Issue; 

/* Qu:  Write a command to remove Members table */

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE Members;

SET FOREIGN_KEY_CHECKS = 1;

SHOW TABLES;

/* Qu : Create the members table again.*/


CREATE TABLE Members(
	
	member_id CHAR(36) NOT NULL,
	member_name VARCHAR(100) NOT NULL,
	member_addressLine1 VARCHAR(500) NOT NULL,
	member_addressLine2 VARCHAR(500) NOT NULL,
	member_category VARCHAR(100) NOT NULL,
	PRIMARY KEY (member_id)
	
);

ALTER TABLE Book_Issue ADD CONSTRAINT FOREIGN KEY fk_member (member_id) REFERENCES Members (member_id); 

ALTER TABLE Book_Return ADD CONSTRAINT FOREIGN KEY fk_member (member_id) REFERENCES Members (member_id);

SHOW TABLES;