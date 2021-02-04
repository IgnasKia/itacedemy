package it.itacademy.java.basics;

import java.util.*;

public class Arithmetics {
    public static void main(String[] args) {

        //Task 4
        int x = 5;

        System.out.println("Cube's volume: " + Math.pow(x, 3) + "cm3");
        System.out.println("Cube's perimeter: " + x*6 + "cm");

        //TASK 5
        myMethod2(2.4f,4);
    }

    static void myMethod2(float feet, float inches) {
        System.out.println("Feet to centimeter: " + feet*30.48 + "cm");
        System.out.println("inch to centimeter: " + inches*2.54 + "cm");

    }
}
