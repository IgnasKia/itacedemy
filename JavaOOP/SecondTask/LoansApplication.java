package com.itacademy.java.oop.basics;

public class LoansApplication {



    public static void main(String[] args) {

        Loan leasing = new Loan(1, 660, LoanType.LEASING, "2021-06-15");
        Loan consumer = new Loan(2, 1536, LoanType.CONSUMER, "2023-03-12");

        System.out.println(leasing.getAmount()+consumer.getAmount());

        Loan[] loans = {leasing, consumer};
        Customer customer = new Customer("Albert", "Baton", 26, 123, loans);
        System.out.println(customer);
        System.out.println("Loans: " + customer.countLoansAmount());
    }

}
