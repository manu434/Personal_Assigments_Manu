---personal assignemnt_1-----

create database studentmanagement
use studentmanagement

create table students(studentid int,firstname varchar(20),lastname varchar(20),age int,gender varchar(10),marks float)

insert into students values(101,'manu','k',20,'male',80.90)
insert into students values(102,'anu','k',21,'female',70)
insert into students values(103,'midhun','kesu',22,'male',90)
insert into students values(104,'soman','k',20,'male',88)
insert into students values(105,'jamanu','kuio',21,'male',50)
insert into students values(106,'indira','jui',22,'female',40)
insert into students values(107,'megha','k',20,'female',70)
insert into students values(108,'manunuo','kyui',21,'male',100)
insert into students values(109,'wemanu','kert',23,'male',10)
insert into students values(110,'meghakesu','shibu',25,'female',95)

select * from students
select firstname,marks from students
select * from students where marks>80


select * from students where age between 18 and 25
select * from students where gender='female'
select * from students  where lastname like '%k'

select * from students max
select avg(marks) from students
select max(marks) as maximummarks,min(marks) as minimummarks from students

alter table students add  city varchar(50)
select * from students
sp_rename 'students.city','hydrabad','column' 
select * from students
update students set hydrabad='city'
select * from students
sp_rename 'students.hydrabad','city','column'
update students set city='hydrabad' where marks>80


delete from students where marks<40
select * from students

drop table students


create table courses(courseid int,coursename varchar(10),studentid int)

insert into courses values(100,'bca',101)
insert into courses values(101,'bcom',102)
insert into courses values(102,'bba',103)
insert into courses values(103,'mba',104)
insert into courses values(104,'mca',105)

select * from courses
select * from students

select students.studentid,students.firstname,courses.coursename from students inner join courses on students.studentid=courses.studentid
select students.studentid,students.firstname,courses.coursename from students left join courses on students.studentid=courses.studentid
select students.studentid,students.firstname,courses.coursename from students right join courses on students.studentid=courses.studentid



 















