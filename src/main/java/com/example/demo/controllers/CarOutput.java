package com.example.demo.controllers;

import com.example.demo.domain.Currency;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class CarOutput {
    @NotNull(message = "Number plate is null")
    @NotBlank(message = "Number plate is empty")
    @Id
    private String numberPlate;
    @NotNull(message = "Model is null")
    @NotBlank(message = "Model is empty")
    private String model;
    @Positive(message = "Price is negative")
    private double priceEuro;
    @NotNull(message = "Number plate is null")
    @NotBlank(message = "Number plate is empty")
    private String date;

    public CarOutput(String numberPlate, String model, double priceEuro, String date) {
        this.numberPlate = numberPlate;
        this.model = model;
        this.priceEuro = priceEuro;
        this.date = date;
    }

    public CarOutput() {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}


