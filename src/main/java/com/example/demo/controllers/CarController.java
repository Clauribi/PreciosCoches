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
import java.util.Optional;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;
    @Autowired
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
            Optional<Car> car = carRepository.findById(numberPlate);
            Optional<Currency> currency = currencyRepository.findById(date);
            if (car.isPresent() && currency.isPresent()) {
                CarOutput carOutput = new CarOutput(numberPlate, car.get().getModel(), car.get().getPriceEuro(), date, car.get().getPriceEuro() * currency.get().getDollar(), car.get().getPriceEuro() * currency.get().getPound());
                return ResponseEntity.ok(carOutput);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
        return null;
    }


}
