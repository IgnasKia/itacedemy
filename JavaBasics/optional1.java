package it.itacademy.java.basics;
import java.util.*;


public class optional1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        checkValidate();
    }

    public static void checkValidate(){
        System.out.println("Password=");
        String password = scanner.nextLine();  // Read user input
        String pattern = "^(?=(?:.*?[0-9]){2})(?=.*[a-z]).{10,}$";
        if(password.matches(pattern)){
            System.out.println("Password is valid: " + password);
        }else
            System.out.println("Password is not valid " + password);
    }
}
