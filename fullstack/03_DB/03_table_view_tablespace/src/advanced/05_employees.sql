use employees;

create view employees_info as
select e.emp_no,
       e.birth_date,
       e.first_name,
       e.last_name,
       e.gender,
       e.hire_date,
       d.from_date as t_from,
       d.to_date as t_to,
       s.salary,
       s.from_date as s_from,
       s.to_date as s_to
from employees e
join dept_emp d on e.emp_no = d.emp_no
join salaries s on e.emp_no = s.emp_no;

-- EMPLOYEES_INFO 뷰에서 재직자의 현재 정보만 출력하세요.
select *
from employees_info
where t_to = '9999-01-01' and s_to = '9999-01-01';

create view emp_dept_info as
select e.emp_no,
       d.dept_no,
       d.from_date,
       d.to_date
from employees e
join dept_manager d on e.emp_no = d.emp_no;

select *
from emp_dept_info
where to_date = '9999-01-01';
