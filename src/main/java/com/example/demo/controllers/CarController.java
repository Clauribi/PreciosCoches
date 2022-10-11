package com.example.demo.controllers;

import com.example.demo.domain.Car;
import com.example.demo.domain.CarAlreadyExists;
import com.example.demo.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping("/cars")
    public ResponseEntity<String> addCar(@Valid @RequestBody Car car) {
        try {
            if (carRepository.existsByNumberPlate(car.getNumberPlate()))
                throw new CarAlreadyExists("car already exists");
            carRepository.save(car);
        } catch (CarAlreadyExists e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } catch (Exception e1) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
