create table Employee( EXP_ID int not null primary key, MANAGER_ID int, FIRST_NAME varchar(50) not null,
LAST_NAME varchar(50) not null, EMP_TITLE varchar(50) not null, SALARY varchar(50) not null,
JOINING_DATE varchar(50) not null, DEP varchar(50));

insert into Employee values(1, null, "Monika", "Arora", "Manager", "100000", "02/20/15 9:00", "HR"),
(2, 1, "Niharika", "Verma", "Executive", "80000", "06/11/14 9:00", "Admin"),
(3, 1, "Vishal", "Singhal", "Executive", "300000", "02/20/14 9:00", "HR"),
(4, null, "Amitabh", "Signh", "Manager", "500000", "02/20/14 9:00", "Admin"),
(5, 4, "Vivek", "Bhati", "Asst. Manger", "500000", "06/11/14 9:00", "Admin"),
(6, 5, "Vipul", "Diwan", "Executive", "200000", "06/11/14 9:00", "Account"),
(7, 4, 'Satish', 'Kumar', 'Lead', '75000', '01/20/14 9:00', 'Account'),
(8, 4, 'Geetika', 'Chauhan', 'Lead', '90000', '04/11/14 9:00', 'Admin');
select * from Employee;

Select concat(FIRST_NAME," ",LAST_NAME) as NAME from Employee where SALARY between 50000 and 1000000;

alter table Employee change column EXP_ID EMP_ID int not null;
desc Employee;
select concat(a.FIRST_NAME," ",a.LAST_NAME) as EMPLOYEE, b.FIRST_NAME as MANAGER from Employee a, Employee b where b.EMP_ID = a.MANAGER_ID;

select DEP, count(*) as no_of_employee from Employee group by DEP order by no_of_employee desc;

select FIRST_NAME from Employee where MANAGER_ID is null;

select count(EMP_ID) from Employee group by JOINING_DATE>01/01/15 and JOINING_DATE<31/12/15;

select * from Employee;
