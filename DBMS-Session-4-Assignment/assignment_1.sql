SELECT member_name FROM Members WHERE member_category = (SELECT member_category FROM Members WHERE member_name = 'Jon Snow');

SELECT b.book_name , t.title_name , m.member_name , book_issue.due_date FROM Books b
INNER JOIN book_issue bi ON bi.title_id = b.title_id
INNER JOIN Titles t ON t.title_id = b.title_id
INNER JOIN Members m ON m.member_id =  bi.member_id
WHERE bi.book_return  = NULL;

SELECT b.book_name , b.book_price FROM Books b
WHERE b.book_price = (SELECT MAX(b.book_price) FROM Books b);

SELECT b.book_name , b.book_price FROM Books b
WHERE b.book_price = (SELECT DISTINCT(b.book_price) FROM Books GROUP BY b.book_price LIMIT 1,1);


