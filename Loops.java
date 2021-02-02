package it.itacademy.java.basics;

public class Loops {

    public static void main(String[] args) {

        myMethod5(365);
        myMethod6(5);
    }

    static void myMethod5(int days) {
        int hours = 0;
        int minutes = 0;

        for (int i = 0;i < days; i++){
             hours += 24;
             minutes += 1440 ;
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year ");

        while (days == 0) {
            hours += 24;
            minutes += 1440 ;
            days--;
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year ");
    }
    static void myMethod6(int x) {

        int factorial = 1;
        for(int i = 1; i <= x; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of number " + x + " is " + factorial);

    }
}
