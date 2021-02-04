package com.itacademy.java.oop.basics;

public class Square {
    private double length;
    private double width;


    public Square(){
    }

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculatePerimeter(){
        return (length+width)*2;
    }

    public double calculateArea(){
        return length*width;
    }


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

