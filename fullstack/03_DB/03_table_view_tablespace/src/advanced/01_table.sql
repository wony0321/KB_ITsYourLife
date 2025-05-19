drop database if exists advdb;

create database advdb;

use advdb;

drop table if exists userTBL;

create table userTBL (
    userID varchar(8) not null primary key ,
    name char(10) not null ,
    birthyear int not null
);

drop table if exists buyTBL;

create table buyTBL (
    num int auto_increment not null primary key ,
    userID varchar(8) not null ,
    prodName varchar(6) not null
);

alter table buytbl
add constraint fk_buy_user
foreign key (userID) references userTBL (userID);
