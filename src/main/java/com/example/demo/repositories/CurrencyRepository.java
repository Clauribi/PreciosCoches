package com.example.demo.repositories;

import com.example.demo.domain.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Date> {
}
