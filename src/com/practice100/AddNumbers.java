package com.practice100;

import java.math.BigInteger;
import java.util.Scanner;

public class AddNumbers {

    // Add Numbers
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter two integers to calculate their sum ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        c = a + b;
        System.out.println("Sum of entered integers = "+c);

        //For Large Number

        String number1, number2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first large number");
        number1 = in.nextLine();
        System.out.println("Enter second large number");
        number2 = in.nextLine();
        BigInteger first = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        BigInteger sum;
        sum = first.add(second);
        System.out.println("Result of addition = " + sum);
    }
}