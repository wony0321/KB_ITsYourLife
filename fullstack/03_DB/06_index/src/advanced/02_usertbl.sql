use sqldb;

-- userTBL의 내용 확인
create index idx_usertbl_addr on usertbl(addr);

show index from usertbl;

-- 여기서는 인덱스 길이 0
show table status like 'usertbl';

analyze table usertbl;

-- 여기서는 인덱스 길이 16384
show table status like 'usertbl';

-- birthYear 컬럼에 대해 idx_usertbl_birthYear 이름의 인덱스를 만드세요.
create index idx_usertbl_birthYear on usertbl(birthYear);

-- name 컬럼에 대해i dx_usertbl_nam 이름의 인덱스를 만드세요
create index dx_usertbl_nam on usertbl(name);

-- 생성된 인덱스의 목록을 확인하세요
show index from usertbl;

-- name 컬럼에 대한 보조인덱스를 삭제
drop index dx_usertbl_nam on usertbl;

-- name + birthYear 조합 인덱스 생성
create index idx_usertbl_name_birthYear on usertbl(name, birthYear);

-- 생성된 인덱스의 목록을 확인하세요
show index from usertbl;

drop index idx_usertbl_addr on usertbl;
drop index idx_usertbl_birthYear on usertbl;
drop index idx_usertbl_name_birthYear on usertbl;

show index from usertbl;