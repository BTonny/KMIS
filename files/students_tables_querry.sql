CREATE TABLE student_regno_seq (
    id INT(4) unsigned NOT NULL AUTO_INCREMENT PRIMARY KEY
);
    
CREATE TABLE students (
    reg_no VARCHAR(6) NOT NULL PRIMARY KEY DEFAULT '0',
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    gender ENUM('M', 'F') NOT NULL,
    age INT(3) UNSIGNED NOT NULL,
    class VARCHAR(5) NOT NULL,
    user_name VARCHAR(250) NOT NULL,
    password VARCHAR(250)
);

DELIMITER $$
CREATE TRIGGER tg_students_regno_insert
BEFORE INSERT ON students
FOR EACH ROW
BEGIN
  INSERT INTO student_regno_seq VALUES (NULL);
  SET NEW.reg_no = CONCAT(DATE_FORMAT(NOW(),'%y'), LPAD(LAST_INSERT_ID(), 4, '0'));
END$$
DELIMITER ;
