INSERT INTO Authors (author_id,author_lname,author_fname,author_address,author_city,author_state)
Values ('172-32-1176','White','Johnson','10932 Bigge Road','Menlo Park','CA');

INSERT INTO Authors (author_id,author_lname,author_fname,author_address,author_city,author_state)
Values ('172-32-1177','Green','Marjorie','309 63rd Street','Oakland','CA');

INSERT INTO Authors (author_id,author_lname,author_fname,author_address,author_city,author_state)
Values ('172-32-1178','Carson','Cheryl','589 Darwin Lane','Berkeley','CA');

SELECT * FROM Authors;

Insert Into Publishers (publisher_id,publisher_name,publisher_city)
Values ('1','New Moon Books','Boston');

Insert Into Publishers (publisher_id,publisher_name,publisher_city)
Values ('2','Binnet and Hardely','Washington');

Insert Into Publishers (publisher_id,publisher_name,publisher_city)
Values ('3','AlgoData Publishers','Berkeley');

SELECT * FROM Publishers;

INSERT INTO Subjects (subject_id,subject_name)
Values ('475-464-24','Computer Science');

INSERT INTO Subjects (subject_id,subject_name)
Values ('475-464-25','Psychology');

INSERT INTO Subjects (subject_id,subject_name)
Values ('475-464-26','Business');

SELECT * FROM Subjects;

INSERT INTO Titles (title_id,title_name,title_type,title_price,subject_id,publisher_id)
Values ('BU1232','The Busy Executive Database Guide','business','19.99','475-464-26','1');

INSERT INTO Titles (title_id,title_name,title_type,title_price,subject_id,publisher_id)
Values ('BU2075','You can combat computer stress','business','56.99','475-464-26','2');

INSERT INTO Titles (title_id,title_name,title_type,title_price,subject_id,publisher_id)
Values ('PS2091','Is Anger the Enemy?','psychology','10.95','475-464-25','3');

SELECT * FROM Titles;

INSERT INTO Members (member_id,member_name,member_addressLine1,member_addressLine2,member_category)
Values ('354-6749-857','Vaibhav','Ganjward','Chandrapur','S');

INSERT INTO Members (member_id,member_name,member_addressLine1,member_addressLine2,member_category)
Values ('354-6749-858','Cheryl','EPIP,Sitapura','Jaipur','S');

INSERT INTO Members (member_id,member_name,member_addressLine1,member_addressLine2,member_category)
Values ('354-6749-574','Keshav Sharma','Hinjewadi','Pune','F');

INSERT INTO Members (member_id,member_name,member_addressLine1,member_addressLine2,member_category)
Values ('354-6749-576','Sam','Darwin Lane','USA','S');

INSERT INTO Members (member_id,member_name,member_addressLine1,member_addressLine2,member_category)
Values ('354-6749-577','Bing','Google Lane','USA','O');

INSERT INTO Members (member_id,member_name,member_addressLine1,member_addressLine2,member_category)
Values ('354-6749-578','Yahoo','Bing Lane','USA','O');

SELECT * FROM Members;


INSERT INTO Books (accession_number,title_id,purchase_date,book_price,book_status)
Values ('23','BU1232','2001-03-02','45.56','Available');

INSERT INTO Books (accession_number,title_id,purchase_date,book_price,book_status)
Values ('24','PS2091','2004-03-02','48.56','Not Available');

INSERT INTO Books (accession_number,title_id,purchase_date,book_price,book_status)
Values ('25','BU2075','2006-03-02','35.56','Available');

SELECT * FROM Books;

INSERT INTO title_author (title_id,author_id)
Values ('BU2075','172-32-1178');

INSERT INTO title_author (title_id , author_id)
Values ('PS2091','172-32-1177');

SELECT * FROM Title_Author;

INSERT INTO Book_Issue(issue_date,accession_number,member_id,due_date)
Values('2016-08-06','24','354-6749-858','2016-08-21');

INSERT INTO Book_Issue(issue_date,accession_number,member_id,due_date)
Values('2016-08-06','25','354-6749-575','2016-11-21');

INSERT INTO Book_Issue(issue_date,accession_number,member_id,due_date)
Values('2016-08-06','23','354-6749-574','2016-11-21');

INSERT INTO book_issue (issue_date , accession_number , member_id , due_date) 
VALUES ('2016-08-12','24','354-6749-857','2016-08-18');

INSERT INTO book_issue (issue_date , accession_number , member_id , due_date) 
VALUES ('2016-08-14','25','354-6749-857','2016-08-20');

INSERT INTO book_issue (issue_date , accession_number , member_id , due_date) 
VALUES ('2016-08-20','25','354-6749-858','2016-08-27');

INSERT INTO book_issue (issue_date , accession_number , member_id , due_date) 
VALUES ('2016-08-21','25','354-6749-574','2016-08-27');

INSERT INTO book_issue (issue_date , accession_number , member_id , due_date) 
VALUES ('2016-08-21','24','354-6749-574','2016-08-27');

INSERT INTO book_issue (issue_date , accession_number , member_id , due_date) 
VALUES ('2016-08-21','24','354-6749-575','2016-08-27');


SELECT * FROM Book_Issue;

INSERT INTO Book_Return(return_date,accession_number,member_id,issue_date)
Values('2016-08-25','25','354-6749-857','2016-08-01');

INSERT INTO Book_Return(return_date,accession_number,member_id,issue_date)
Values(null,'23','354-6749-858','2016-08-10');

INSERT INTO Book_Return(return_date,accession_number,member_id,issue_date)
Values(null,'25','354-6749-575','2016-08-01');

SELECT * FROM Book_Return;