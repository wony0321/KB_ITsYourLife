-- emp_no, first_name, last_name, title 출력
select e.emp_no, e.first_name, e.last_name, t.title
from employees e
join titles t on e.emp_no = t.emp_no;

-- 직원의 기본 정보 모두, title, salary
select e.emp_no, e.first_name, e.last_name, t.title, s.salary
from employees e
join titles t on e.emp_no = t.emp_no
join salaries s on e.emp_no = s.emp_no;

/*
○ 출력항목:  emp_no, first_name, last_name, department
○ 정렬: emp_no 오름 차순
*/
select e.emp_no, e.first_name, e.last_name, dp.dept_name
from employees e
join dept_emp d on e.emp_no = d.emp_no
join departments dp on d.dept_no = dp.dept_no
order by e.emp_no;

/*
○ 출력항목: 부서번호, 부서명, 인원수
○ 정렬: 부서번호 오름차순
*/
select d.dept_no, dp.dept_name, count(*)
from dept_emp d
join departments dp on d.dept_no = dp.dept_no
group by d.dept_no, dp.dept_name
order by d.dept_no;

-- 직원번호가 10209인 직원의 부서이동 히스토리를 출력하세요
-- 출력항목: emp_no, first_name, last_name, dept_name, from_date, to_date
select e.emp_no, e.first_name, e.last_name, dp.dept_name, d.from_date, d.to_date
from employees e
         join dept_emp d on e.emp_no = d.emp_no
         join departments dp on d.dept_no = dp.dept_no
where e.emp_no = '10209'
order by e.emp_no;
