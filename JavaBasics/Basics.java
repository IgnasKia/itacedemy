package it.itacademy.java.basics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basics
{
    public static void main(String[] args) throws IOException
    {


        //Task 1
        //Enter data using BufferReader
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String name = reader.readLine();
        String surname = reader.readLine();
        String age = reader.readLine();
        int age1 =Integer.parseInt(age);

        // Printing the read line
        System.out.println("Hello I am " + name +" " + surname + " I am " + age + ". I am attending IT Academy 2021! ");


       //Task 2
        byte zero = 0;
        short a = 3;
        int b = 1;
        char d = ' ';
        float e = 2.0f;
        boolean f = true;
        String output = "H" + a + b + b + zero + d + "w" + zero + "r" + b + "d" + d + e + d + f;
        System.out.println(output);

        //Task 3
        myMethod(5,3);
    }

    static void myMethod(int x, int y) {
        System.out.println("sum:" + (x+y));
        System.out.println("difference:" + (x-y));
        System.out.println("product:" + (x*y));
        System.out.println("multiple:" + (x*y));
        System.out.println("distance:" + (x-y));
        System.out.println("maximum:" + (Math.max(x, y)));
        System.out.println("minimum:" + (Math.min(x, y)));
    }


}