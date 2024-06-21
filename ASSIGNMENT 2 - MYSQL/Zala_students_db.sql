CREATE DATABASE zala;

USE zala;

CREATE TABLE students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT,
    grade VARCHAR(10)
);

alter table students add subjects varchar(20);
alter table students add guide varchar(20);

INSERT INTO students (name, age, grade, subjects , guide) VALUES ('Darshan', 20, 'A','DevOps','Aasim sir');
INSERT INTO students (name, age, grade, subjects , guide) VALUES ('ashish', 19, 'B','Data Science','Chirag sir');
INSERT INTO students (name, age, grade, subjects , guide) VALUES ('Khushi', 19, 'A','MERN','Ashuthosh sir');
INSERT INTO students (name, age, grade, subjects , guide) VALUES ('Komal', 20, 'B+','Cyber Security','Sanath sir');
INSERT INTO students (name, age, grade, subjects , guide) VALUES ('Asha', 20, 'B+','DevOps','Aasim sir');
INSERT INTO students (name, age, grade, subjects , guide) VALUES ('Jinal', 20, 'A','Tech Head','Vivek sir');
INSERT INTO students (name, age, grade, subjects , guide) VALUES ('Nikita', 20, 'A','Sr.DevOps Engineer','Aasim sir');


update students set student_id = 1 where student_id = 2;
update students set subjects = 'Tech Head' where student_id = 4;


delete from students where  student_id =1;
SELECT * FROM students;





