drop database if exists advdb;

create database advdb;

use advdb;

drop table if exists userTBL;

create table userTBL
(
    userID    varchar(8) not null primary key,
    name      char(10),
    birthyear int,
    mobile    varchar(3) not null,

    check (birthyear >= 1900 and birthyear <= 2023)
);