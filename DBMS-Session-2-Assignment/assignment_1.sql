SELECT member_id ,  member_name , member_addressLine1 , member_addressLine2 , member_category FROM Members;

SELECT member_id ,  member_name , member_category FROM Members;

SELECT member_id ,  member_name , member_category FROM Members WHERE member_category='F';

SELECT member_category FROM Members;

SELECT member_name , member_category FROM Members ORDER BY member_name DESC;

SELECT title_name ,  publisher_id FROM titles;

SELECT member_category, COUNT(member_id) as Total
FROM members
GROUP BY member_category;

SELECT m.member_name FROM Members m
INNER JOIN Members e
ON e.member_name = 'Keshav Sharma' AND m.member_category=e.member_category ;

SELECT issue_date , accession_number , member_id ,
IFNULL(return_date,'Book Not Returned') as Return_Date  
FROM book_return;
