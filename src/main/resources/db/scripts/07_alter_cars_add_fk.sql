ALTER TABLE cars ADD date_currency VARCHAR(10) NOT NULL;
ALTER TABLE cars ADD CONSTRAINT fk_date_currency FOREIGN KEY (date_currency) REFERENCES currency (date);