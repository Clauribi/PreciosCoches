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
    private String fecha;
    @Positive(message = "Euro is negative")
    private double euro;
    @Positive(message = "Dollar is negative")
    private double dollar;
    @Positive(message = "Pound is negative")
    private double pound;

    public Currency(String fecha, double euro, double dollar, double pound) {
        this.fecha = fecha;
        this.euro = euro;
        this.dollar = dollar;
        this.pound = pound;
    }

    public Currency() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
