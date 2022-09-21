use ustDB;
create table Worker(WORKER_ID int not null,
FIRST_NAME varchar(50) not null,
LAST_NAME varchar(50) not null,
SALARY int not null,
JOINING_DATE varchar(50) not null,
DEPARTMENT varchar(50) not null);

select * from Worker;
desc worker;

insert into Worker values
(1,"Monika","Arora",100000,"2014-02-20 09:00:00 ","HR"),
(2,"Niharika","Verma",80000,"2014-06-11 09:00:00:","Admin"),
(3,"Vishal","Singhal",300000,"2014-02-20 9:00:00","HR"),
(4,"Amitabh","Singh",500000,"2014-02-20 09:00:00","Admin"),
(5,"Vivek","Bhati",500000,"2014-06-11 09:00:00","Admin"),
(6,"Vipul","Diwan",200000,"2014-06-11 09:00:00","Account"),
(7,"satish","Kumar",75000,"2014-01-20 09:00:00","Account"),
(8,"Geetika","Chauhan",90000,"2014-04-11 09:00:00","Admin");

desc worker;

select * from worker where mod(worker_id,2)=0;

select * from worker where mod(worker_id,2)<>0;


select upper(first_name) from worker;

select distinct department from worker;

select substring(first_name,1,3) from worker;


select rtrim(first_name)from worker;

select ltrim(Department) from worker;

select distinct department,length(department) from worker;
select replace(first_name,'a','A')from worker;

select * from worker order by first_name asc;


select * from worker where first_name in('Vipul','Satish');

select * from worker where first_name not in('Vipul','Satish');

select worker_title,affected_from,count(*) from title group by worker_title,affected_from having count(*)>1;

select * from worker where department like 'Admin';

select * from worker where first_name like '%a%';

select * from worker where first_name like '%a';

select * from worker where first_name like '______h';

select * from worker where salary between 100000 and 500000;
select * from worker where year(joining_date)=2014 and month(joining_date)=2;

select count(*) from worker  where department='Admin';

select concat(first_name,' ',last_name)as worker_Name,Salary from worker where worker_id in(select worker_id from worker where salary between 50000 and 100000);

select department,count(worker_id) No_Of_Workers from worker
group by (department) order by No_Of_Workers desc;


