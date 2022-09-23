package com.java8.lambdaExp;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number  : ");
        int c = scanner.nextInt();
        System.out.println("Enter the second number  : ");
        int d = scanner.nextInt();

        Calculator c1 = (a, b) -> (a+b);
        Calculator c2 = (a, b) -> (a*b);
        System.out.println("Sum of " + c +" and " + d + " is = "+c1.performMathOperation(c,d));
        System.out.println("Multiplication of " + c +" and " + d + " is = "+c2.performMathOperation(c,d));
    }
}
