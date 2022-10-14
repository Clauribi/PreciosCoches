create table cars(
	number_plate varchar(8) PRIMARY KEY,
	model varchar(9) NOT NULL,
	price_euro double,
	date_currency VARCHAR(10)
);
alter table cars add constraint fk_date_currency foreign key (date_currency) references currency (fecha);


