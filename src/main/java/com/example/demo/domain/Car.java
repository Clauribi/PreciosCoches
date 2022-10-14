package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity(name="cars")
public class Car {
    @NotNull(message = "Number plate is null")
    @NotBlank(message = "Number plate is empty")
    @Id
    private String numberPlate;
    @NotNull(message = "Model is null")
    @NotBlank(message = "Model is empty")
    private String model;
    @Positive(message = "Price is negative")
    private double priceEuro;
    @NotNull(message = "date is null")
    @NotBlank(message = "date is empty")
    private String dateCurrency;


    public Car(String numberPlate, String model, double priceEuro, String dateCurrency) {
        this.numberPlate = numberPlate;
        this.model = model;
        this.priceEuro = priceEuro;
        this.dateCurrency = dateCurrency;
    }

    public Car() {
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPriceEuro() {
        return priceEuro;
    }

    public void setPriceEuro(double priceEuro) {
        this.priceEuro = priceEuro;
    }

    public String getDateCurrency() {
        return dateCurrency;
    }

    public void setDateCurrency(String dateCurrency) {
        this.dateCurrency = dateCurrency;
    }
}
