use advdb;

drop table if exists userTBL;

create table userTBL
(
    userID    varchar(8) not null primary key,
    name      char(10)   not null,
    birthyear int        not null default -1,
    addr      varchar(2) not null default '서울',
    mobile1   varchar(3),
    mobile2   varchar(8),
    height    smallint            default 170,
    mDate     date
);

insert into userTBL (userID, name)
values ('user001', '홍길동');

-- mobile1 칼럼 삭제
alter table userTBL
drop column mobile1;

-- name -> uName 으로 칼럼명 변경
alter table userTBL
change column name uName varchar(10) not null;

-- 기본키 제거
alter table userTBL
drop primary key ;