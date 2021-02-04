package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class Customer {

    private String name;
    private String surname;
    private int age;
    private int personalNumber;
    private Loan[] loans;

    public Customer(){

    }

    public Customer(String name, String surname, int age, int personalNumber, Loan[] loans) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
        this.loans = loans;
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }

//    public double calculateCustomerLoans(){
//        int result = 0;
//        for (Loan loan : loans)
//            result += loan.getAmount();
//        return result;
//    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public double countLoansAmount() {
        double sum = 0;
        for (Loan l : this.loans) {
            sum += l.getAmount();
        }
        return sum;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", personalNumber=" + personalNumber +
                ", loans=" + Arrays.toString(loans) +
                '}';
    }
}
