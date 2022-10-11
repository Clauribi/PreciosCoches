package com.example.demo.repositories;

import com.example.demo.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {

    boolean existsByNumberPlate(String numberPlate);
}
