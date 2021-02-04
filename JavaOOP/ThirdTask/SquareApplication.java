package com.itacademy.java.oop.basics;

public class SquareApplication {
    public static void main(String[] args) {

    Square square1 = new Square(5,2);
    Square square2 = new Square(0,9);
    Square square3 = new Square(-8,-3);

    Square[] squares = {square1, square2, square3};

        for(Square square : squares){
            if(square.getLength() <= 0 || square.getWidth() <= 0){
                System.out.println("Square line can't be negative or zero " + square);
            }else{
                System.out.println("Perimeter of " + square + " is " + square.calculatePerimeter() + " .Area of square is " + square.calculateArea());
            }
        }
    }






}
