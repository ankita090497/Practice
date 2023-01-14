package com.practice100;

import java.util.Scanner;

public class GetInputFromUser {

    // Get input from user
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.nextLine();
        System.out.println("You entered string " + s);
        System.out.println("Enter an integer");
        int a = in.nextInt();
        System.out.println("You entered integer " + a);
        System.out.println("Enter a float");
        float b = in.nextFloat();
        System.out.println("You entered float " + b);
    }
}
