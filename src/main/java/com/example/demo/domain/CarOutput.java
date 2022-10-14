package com.example.demo.domain;

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
    @NotNull(message = "Date is null")
    @NotBlank(message = "Date is empty")
    private String date;

    }


