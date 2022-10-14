drop table cars;
create table cars(
	number_plate varchar(8) PRIMARY KEY,
	model varchar(9) NOT NULL,
	price_euro double
);