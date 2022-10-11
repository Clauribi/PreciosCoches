package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Positive;
import java.util.Date;

@Entity(name="currency")
public class Currency {

    @Id
    private Date dateCurrency;
    @Positive(message = "Euro is negative")
    private double euro;
    @Positive(message = "Dollar is negative")
    private double dollar;
    @Positive(message = "Pound is negative")
    private double pound;

    public Currency(Date dateCurrency, double euro, double dollar, double pound) {
        this.dateCurrency = dateCurrency;
        this.euro = euro;
        this.dollar = dollar;
        this.pound = pound;
    }

    public Currency() {
    }

    public Date getDate() {
        return dateCurrency;
    }

    public void setDate(Date date) {
        this.dateCurrency = date;
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
