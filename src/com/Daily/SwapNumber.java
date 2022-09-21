package com.Daily;

import java.util.Scanner;

public class SwapNumber {
    //1. using 3rd variable

   /* public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter value of b = ");
        int b = sc.nextInt();
        System.out.print("Before swapping value of a = "+a+" and b = "+b);
        int tmp = b;
        b = a;
        a = tmp;
        System.out.println();
        System.out.print("After swapping value of a = "+a+" and b = "+b);
    }*/

    //2.  Without using 3rd variable
    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter value of b = ");
        int b = sc.nextInt();
        System.out.print("Before swapping value of a = "+a+" and b = "+b);

        b = (b-a);
        a = (a+b);
        b = (a-b);
        System.out.println();
        System.out.print("After swapping value of a = "+a+" and b = "+b);
    }*/

    // 3. using multiply and divide op.
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter value of b = ");
        int b = sc.nextInt();
        System.out.print("Before swapping value of a = " + a + " and b = " + b);

        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println();
        System.out.print("After swapping value of a = "+a+" and b = "+b);
    }*/

    //4. Using one line expression
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter value of b = ");
        int b = sc.nextInt();
        System.out.print("Before swapping value of a = " + a + " and b = " + b);

        a = (b - a) + (b = a);
        System.out.println();
        System.out.print("After swapping value of a = "+a+" and b = "+b);
    }*/

    //5. using XOR operation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter value of b = ");
        int b = sc.nextInt();
        System.out.print("Before swapping value of a = " + a + " and b = " + b);

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println();
        System.out.print("After swapping value of a = "+a+" and b = "+b);
    }
    }