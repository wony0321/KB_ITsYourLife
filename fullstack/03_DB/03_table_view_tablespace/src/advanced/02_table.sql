drop database if exists advdb;

create database advdb;

use advdb;

drop table if exists userTBL;

create table userTBL
(
    userID    varchar(8) not null primary key,
    name      char(10)   not null,
    birthyear int        not null,
    email     varchar(30) unique
);