package com.itacademy.java.oop.basics;

public class EmployeeManager {
    public static void main(String[] args) {

        Employee employee = new Employee("John",
                "Albeert",
                ContractType.fromDisplayValue("Full_time"),
                "2021-02-03",
                900,
                "FrontEnd");
        System.out.println(employee);
        }

    }

