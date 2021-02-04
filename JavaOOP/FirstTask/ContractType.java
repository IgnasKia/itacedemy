package com.itacademy.java.oop.basics;

public enum ContractType {

    FULL_TIME("Full_time"), PART_TIME("Part_time");

    private String displayValue;

    public String getDisplayValue() {
        return displayValue;
    }

    ContractType(String displayValue) {
        this.displayValue = displayValue;
    }

    public static ContractType fromDisplayValue(String displayValue){
        for (ContractType type : values()){
            if (type.displayValue.equals(displayValue)) {
                return type;
            }
        }
        return null;
    }

}
