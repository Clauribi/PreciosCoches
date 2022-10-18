package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;

@Entity(name="cars")
public class Car {
    @Id
    private String numberPlate;
    @NotNull(message = "Model is null")
    @NotBlank(message = "Model is empty")
    private String model;
    @Positive(message = "Price is negative")
    private double priceEuro;
    @NotNull(message = "date is null")
    @NotBlank(message = "date is empty")
    private Date dateCurrency;


    public Car(String numberPlate, String model, double priceEuro, Date dateCurrency) {
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

    public Date getDateCurrency() {
        return dateCurrency;
    }

    public void setDateCurrency(Date dateCurrency) {
        this.dateCurrency = dateCurrency;
    }
}
