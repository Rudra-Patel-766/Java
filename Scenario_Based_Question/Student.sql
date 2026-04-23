create database student_details;
use student_details;

CREATE TABLE Student (
    rollno INT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);

insert into student values
(1, 'ABC', 19),
(2, 'XYZ', 20),
(3, 'PQR', 20);