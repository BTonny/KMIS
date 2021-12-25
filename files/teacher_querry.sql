CREATE TABLE teacher_id_seq (
    id INT(4) unsigned NOT NULL AUTO_INCREMENT PRIMARY KEY
);
    
CREATE TABLE teachers
(
id varchar(5) NOT NULL PRIMARY KEY DEFAULT '0',
first_name varchar(50) NOT NULL,
last_name varchar(50) NOT NULL,
subject_codes varchar(255),
user_name varchar(250) NOT NULL,
password varchar(250)
);

DELIMITER $$
CREATE TRIGGER tg_teachers_regno_insert
BEFORE INSERT ON teachers
FOR EACH ROW
BEGIN
  INSERT INTO teacher_id_seq VALUES (NULL);
  SET NEW.id = CONCAT('T', LPAD(LAST_INSERT_ID(), 4, '0'));
END$$
DELIMITER ;
