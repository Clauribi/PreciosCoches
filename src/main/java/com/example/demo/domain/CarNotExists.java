package com.example.demo.domain;

public class CarNotExists extends Exception{
    public CarNotExists(String message) {
        super(message);
    }
}
