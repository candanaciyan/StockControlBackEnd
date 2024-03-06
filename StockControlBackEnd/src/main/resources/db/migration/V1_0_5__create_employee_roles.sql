insert into employee_role values (
(select id from employee where employee_name = 'ahmet'),
(select id from role where role = 'employee'));

insert into employee_role values (
(select id from employee where employee_name = 'admin'),
(select id from role where role = 'admin'));