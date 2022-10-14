package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity(name="currency")
public class Currency {
    @Id
    @NotNull(message = "Date is null")
    @NotBlank(message = "Date is empty")
    private String date;
    @Positive(message = "Euro is negative")
    private double euro;
    @Positive(message = "Dollar is negative")
    private static double dollar;
    @Positive(message = "Pound is negative")
    private  static double pound;

    public Currency(String date, double euro, double dollar, double pound) {
        this.date = date;
        this.euro = euro;
        this.dollar = dollar;
        this.pound = pound;
    }

    public Currency() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getDollar() {
        return dollar;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar;
    }

    public double getPound() {
        return pound;
    }

    public void setPound(double pound) {
        this.pound = pound;
    }
}
