package com.example.demo.domain;

public class CarAlreadyExists extends Exception {
    public CarAlreadyExists(String message) {
        super(message);
    }
}
