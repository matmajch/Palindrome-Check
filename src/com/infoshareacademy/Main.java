package com.infoshareacademy;

import java.util.Scanner;

public class Main {

    public static void result(String text) {

        String reversed = new StringBuilder(text).reverse().toString();
        if (text.equals(reversed)) {
            System.out.println("This is a palindrome:");
        } else {
            System.out.println("This is not a palindrome!");
        }

    }

    public static void main(String[] args) {


        String test1="1212121";
        String test2="4333334";
        String test3="1234567";
        String test4="76543221";
        String test5="0001000";

        result(test1);
        System.out.println(test1);
        result(test2);
        System.out.println(test2);
        result(test3);
        System.out.println(test3);
        result(test4);
        System.out.println(test4);
        result(test5);
        System.out.println(test5);


        System.out.println("Now type your own number, and I will check :)");
        Scanner scanner = new Scanner(System.in);
        String userNumber = scanner.next();
        result(userNumber);
    }
}
