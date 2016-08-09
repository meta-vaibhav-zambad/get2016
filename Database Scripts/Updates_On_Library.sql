UPDATE Members
SET member_addressLine2='Pune'
WHERE member_addressLine2='Jaipur';

SELECT * FROM Members;

UPDATE Members 
SET member_addressLine1='Civil Lines'
WHERE member_addressLine1='EPIP,Sitapura' AND member_category='F'; 

SELECT * FROM Members;

ALTER TABLE Titles DROP FOREIGN KEY fk_publisher;

ALTER TABLE Titles DROP KEY publisher_id;