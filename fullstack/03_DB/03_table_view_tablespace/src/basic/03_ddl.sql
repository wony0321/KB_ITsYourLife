use tabledb;

drop table if exists usertbl;
drop table if exists buytbl;
drop table if exists prodTbl;


create table usertbl (
    userID    char(8)     not null,
    name      varchar(10) not null,
    birthyear int         not null,

    -- constraint : 제약조건을 명식적으로 이름붙여 정의
    -- primary key [기본키제약조건이름] (기본키로 지정할 칼럼)
    constraint primary key PK_userTBL_userID(userID)
);

create table prodTbl (
  prodCode char(3) not null,
  prodID char(4) not null,
  prodDate DATETIME not null,
  prodCur char(10),

  constraint primary key PK_prodTBL_prodCode_prodID(prodCode, prodID)
);
