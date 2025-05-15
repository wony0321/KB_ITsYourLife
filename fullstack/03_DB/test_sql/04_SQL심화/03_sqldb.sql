select *
from emptbl;


select e.emp as 부하직원, m.emp as 직속상관, m.empTel as 직속상관연락처
from emptbl e
join emptbl m on e.manager = m.emp
where e.emp = '유대리';

