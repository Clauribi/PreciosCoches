package com.example.demo.controllers;

import com.example.demo.domain.Car;
import com.example.demo.domain.CarAlreadyExists;
import com.example.demo.domain.CarNotExists;
import com.example.demo.domain.Currency;
import com.example.demo.repositories.CarRepository;
import com.example.demo.repositories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;
    private CurrencyRepository currencyRepository;

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

    @GetMapping("/car/{date}/{numberPlate}")
    public ResponseEntity<CarOutput> getCarCurrency(@Valid @PathVariable String date, @PathVariable String numberPlate) {
        try {
            if (!carRepository.existsByNumberPlate(numberPlate)) {
                throw new CarNotExists("car not exists");
            }else { Car car = carRepository.getReferenceById(numberPlate);
                return ResponseEntity.ok(new CarOutput(numberPlate, car.getModel(), car.getPriceEuro(), date));
            }
        }catch (CarNotExists e){
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }



    }



}
