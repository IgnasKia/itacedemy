package it.itacademy.java.basics;
import java.util.*;

public class Calculator {

    int x = 0;
    int y = 0;
    int z = 0;
    
    static Scanner myObj = new Scanner(System.in);

    public static void main(String[] args){

        calculate();

    }

    public static void calculate(){
        String yesNo;
//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter figure(rectangle,triangle,square)");
        String figure = myObj.nextLine();  // Read user input

        String choice;
        boolean isRunning = true;
        while(isRunning) {
            switch (figure) {
                case "rectangle":
                    calculateRectangle();
                    break;
                case "triangle":
                    calculateTriangle();
                    break;
                case "square":
                    calculateSquare();
                    break;
                default:
                    System.out.println("Error: bad input");
            }
            System.out.println("Do you want to continue? (Y/N)");
            choice = myObj.next();
            switch(choice)
            {
                case "Y":
                    break;
                case "N":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Incorrect parameter, running again");
            }

        }
    }
    public static void calculateRectangle(){
        System.out.println("Enter figure values");
        x = myObj.nextInt();
        y = myObj.nextInt();
        if (x == 0 || y == 0) {
            System.out.println("Rectangle line value can't be 0");
        } else if (x < 0 || y < 0) {
            System.out.println("Rectangle line value can't be negative");
        } else
            System.out.println("Rectangle perimeter is " + (x * 2 + y * 2) + " and area is " + (x * y));
    }
    public static void calculateTriangle(){
        System.out.println("Enter figure values");
        x = myObj.nextInt();
        y = myObj.nextInt();
        z = myObj.nextInt();
        int s = (x + y + z) / 2;
        double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
        if (x == 0 || y == 0 || z == 0) {
            System.out.println("Triangle line value can't be 0");
        } else if (x < 0 || y < 0) {
            System.out.println("Triangle line value can't be negative");
        } else
            System.out.println("Triangle perimeter is " + (x + y + z) + " and area is " + area);
    }
    public static void calculateSquare(){
        System.out.println("Enter figure values");
        x = myObj.nextInt();
        if (x <= 0) {
            System.out.println("Square line value can't be 0 or negative");
        } else
            System.out.println("Square perimeter is " + (x * 4) + " and area is " + (x * x));
    }
}
