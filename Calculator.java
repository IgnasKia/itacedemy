package it.itacademy.java.basics;
import java.util.*;

public class Calculator {

    public static void main(String[] args){

        calculate();
    }

    static void calculate(){
        String yesNo;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter figure(rectangle,triangle,square)");

        String figure = myObj.nextLine();  // Read user input
        int x, y, z;
        if ("rectangle".equals(figure) || "triangle".equals(figure) || "square".equals(figure)) {
            switch (figure) {
                case "rectangle":
                    System.out.println("Enter figure values");
                    x = myObj.nextInt();
                    y = myObj.nextInt();
                    if (x == 0 || y == 0) {
                        System.out.println("Rectangle line value can't be 0");
                    } else if (x < 0 || y < 0) {
                        System.out.println("Rectangle line value can't be negative");
                    } else
                        System.out.println("Rectangle perimeter is " + (x * 2 + y * 2) + " and area is " + (x * y));
//                    System.out.println("Do you want to run program again? [y/n]");
//                    yesNo = myObj.nextLine();  // Read user input
//                    Thread.sleep(4000);
//                    if("n".equals(yesNo)){
//                        break;
//                    }
//                    calculate();
                    break;
                case "triangle":
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
                    break;
                case "square":
                    System.out.println("Enter figure values");
                    x = myObj.nextInt();
                    if (x <= 0) {
                        System.out.println("Square line value can't be 0 or negative");
                    } else
                        System.out.println("Square perimeter is " + (x * 4) + " and area is " + (x*x));
                        calculate();
                    break;
            }
        } else
            System.out.println("Error:bad input");


    }
}
