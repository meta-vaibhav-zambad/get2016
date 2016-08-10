/*QU: Change value of addressLine2 column of Members table with “Jaipur”.*/

UPDATE Members
SET member_addressLine2='Pune'
WHERE member_addressLine2='Jaipur';

SELECT * FROM Members;

/*Qu: Change value of addressLine1 column of Members table with value “EPIP, Sitapura” for the members belonging to category “F”.*/

UPDATE Members 
SET member_addressLine1='Civil Lines'
WHERE member_addressLine1='EPIP,Sitapura' AND member_category='F'; 

SELECT * FROM Members;

/* Qu: Delete all the rows from Publishers table. */

SELECT * FROM Publishers;

SET FOREIGN_KEY_CHECKS = 0;

DELETE FROM Publishers;

SET FOREIGN_KEY_CHECKS = 1;

SELECT * FROM Publishers;

/* Qu: Insert the sample data back in Publishers table using substitution variables. */

SET @publisher_id = '1',@publisher_name='New Moon Books',@publisher_city='Boston';

Insert Into Publishers (publisher_id,publisher_name,publisher_city)
Values (@publisher_id,@publisher_name,@publisher_city);

SET @publisher_id = '2',@publisher_name='Binnet and Hardely',@publisher_city='Washington';

Insert Into Publishers (publisher_id,publisher_name,publisher_city)
Values (@publisher_id,@publisher_name,@publisher_city);

SET @publisher_id = '3',@publisher_name='Algo Publishers',@publisher_city='Berkeley';

Insert Into Publishers (publisher_id,publisher_name,publisher_city)
Values (@publisher_id,@publisher_name,@publisher_city);

SELECT * FROM Publishers;

/*Qu: Delete those rows of Titles table belonging to Publisher with publisher_id = 1*/

SELECT * FROM Titles;

DELETE FROM Titles WHERE publisher_id='1';

SELECT * FROM Titles;