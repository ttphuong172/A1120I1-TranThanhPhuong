create database hamthongdung;
use hamthongdung;
create table sinhvien(
id int not null unique auto_increment primary key,
ten varchar(50) not null,
tuoi int not null,
khoahoc varchar(10) not null,
sotien int not null
);

insert into sinhvien( ten, tuoi, khoahoc,sotien)
values
('Hoang',21,'CNTT',400000),
('Viet',19,'DTVT',320000),
('Thanh',18,'KTDN',400000),
('Nhan',19,'CK',450000),
('Huong',20,'TCNH',500000),
('Hung',21,'CNTT',200000)