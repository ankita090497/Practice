package com.java8.lambdaExp;

import java.util.Scanner;

@FunctionalInterface
interface PrintNumber{
    public int print(int number);
}

class PrintSquare {

    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        PrintNumber p = n -> n*n;
        System.out.println("Square of " + num +" is = "+p.print(num));
    }
}
