-- employees db에서 각 부서별 관리자를 출력하세요
-- 단, 현 재직자만 출력하세요

select *
from dept_manager -- 부서별 관리자 tb
where to_date = '9999-01-01'; -- 재직자

-- 부서번호 d005 부서의 현재 관리자 정보 출력
select *
from dept_manager
where to_date = '9999-01-01'
and dept_no = 'd005';

/*
SUBQUERIES
-- 서브 쿼리는 다른 쿼리에서 실행되는 쿼리
-- 데이블 내에서 존재하지 않는 조건에 근거한 값들을 검색할 때 사용
*/

-- 조건1. 부서 번호가 d005인 부서
-- 조건2. 관리자의 정보
-- 출력 -> 관리자 정보
select *
from employees
where emp_no = (
    select d.emp_no
    from dept_manager as d
    where to_date = '9999-01-01'
    and dept_no = 'd005'
    );

/*
CTE (Common Table Expression)
- 서브 쿼리랑 같은 개념으로 코드의 가독성과 재사용을 위해 임시 결과 테이블을 선언
*/

WITH current_manager as (
    select emp_no
    from dept_manager
    where to_date = '9999-01-01'
    and dept_no = 'd005')
select *
from employees
where emp_no = (select emp_no from current_manager);

/*
employees 테이블에서 페이지네이션으로 페이지를 추출하려 한다
다음 조건 하에서 8번 페이지의 데이터를 출력하세요
입사일을 내림차순으로 정렬
한 페이지당 20명의 정보 출력
*/

select *
from employees
order by hire_date desc
limit 20;

select *
from salaries
where to_date = '9999-01-01'
and salary > all (
    select avg(salary)
    from salaries
    where to_date = '9999-01-01'
);
