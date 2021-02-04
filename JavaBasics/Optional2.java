//Task:3
//
//        - There is a string s of lowercase English letters that is repeated infinitely many times.
//        Given an integer n find and print the number of letter a in the first n letters of the infinite string
//
//
//        Input: n = 10; s = abcac
//
//        Output: 4
//
//        Why?: The substring we consider is abcacabcac the first 10 characters of the infinite string. There are 4 occurrences of a in the substring.
//
//        Another example: int: n = 10000000000; s = a; out: 10000000000

package it.itacademy.java.basics;
import java.util.*;


public class Optional2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i<s.length();i++){
            if(s.charAt(i)=='a'){
                count1++;
            }
        }
        count1 = count1 * (n/s.length());

        for (int i = 0; i<n % s.length();i++){
            if(s.charAt(i)=='a'){
                count2++;
            }
            System.out.println("Count2: " + count2);
        }
        System.out.println(count2+count1);
    }


}
