package com.example.demo.controllers;

import com.example.demo.domain.Currency;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;

public class CarOutput {
    @Id
    private String numberPlate;
    @NotNull(message = "Model is null")
    @NotBlank(message = "Model is empty")
    private String model;
    @Positive(message = "Price is negative")
    private double priceEuro;
    @NotNull(message = "Number plate is null")
    @NotBlank(message = "Number plate is empty")
    private Date date;
    @Positive(message = "Dollar is negative")
    private double priceDollar;
    @Positive(message = "Pound is negative")
    private double pricePound;

    public CarOutput(String numberPlate, String model, double priceEuro, Date date, double priceDollar, double pricePound) {
        this.numberPlate = numberPlate;
        this.model = model;
        this.priceEuro = priceEuro;
        this.date = date;
        this.priceDollar = priceDollar;
        this.pricePound = pricePound;
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

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public double getPriceDollar() {
        return priceDollar;
    }

    public void setPriceDollar(double priceDollar) {
        this.priceDollar = priceDollar;
    }

    public double getPricePound() {
        return pricePound;
    }

    public void setPricePound(double pricePound) {
        this.pricePound = pricePound;
    }
}


