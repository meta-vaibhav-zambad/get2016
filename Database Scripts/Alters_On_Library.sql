USE Library;

SHOW TABLES;

ALTER TABLE Book_Issue

ALTER issue_date SET DEFAULT '2016-08-09';

DESCRIBE Book_Issue; 

ALTER TABLE Book_Issue

ALTER due_date SET DEFAULT '2016-08-24';

DESCRIBE Book_Issue; 

ALTER TABLE Book_Issue DROP FOREIGN KEY fk_member;

ALTER TABLE Book_Return DROP FOREIGN KEY fk_member;

DROP TABLE Members;

SHOW TABLES;

CREATE TABLE Members(
	
	member_id CHAR(36) NOT NULL,
	member_name VARCHAR(100) NOT NULL,
	member_address VARCHAR(500) NOT NULL,
	member_category VARCHAR(100) NOT NULL,
	PRIMARY KEY (member_id)
	
);

ALTER TABLE Book_Issue ADD member_id CHAR(36) NOT NULL;

ALTER TABLE Book_Issue ADD CONSTRAINT FOREIGN KEY fk_member (member_id) REFERENCES Members (member_id); 

ALTER TABLE Book_Return ADD member_id CHAR(36) NOT NULL;

ALTER TABLE Book_Return ADD CONSTRAINT FOREIGN KEY fk_member (member_id) REFERENCES Members (member_id);

SHOW TABLES;