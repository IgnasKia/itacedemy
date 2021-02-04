package com.itacademy.java.oop.basics;

public enum LoanType {
    LEASING("Leasing"),CONSUMER("Consumer");

    private String displayValue;

    LoanType(String displayValue) {

        this.displayValue = displayValue;
    }

}
