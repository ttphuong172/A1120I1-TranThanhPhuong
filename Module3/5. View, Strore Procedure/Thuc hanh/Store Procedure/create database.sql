create database bank;
use bank;
create table customer(
customer_number int(11) not null primary key,
fullname varchar(50) not null,
email varchar(50) default null,
address varchar(50) not null,
phone varchar(50) default null
);

create table account(
account_number int(11) not null primary key,
acount_type varchar(10) not null,
date date not null,
banlace int not null,
customer_number int(11) not null,
foreign key(account_number) references customer(customer_number)
);

create table transactions(
trans_number int not null,
account_number int(11) not null,
date date not null,
amount int not null,
foreign key(account_number) references acount(account_number)
);


