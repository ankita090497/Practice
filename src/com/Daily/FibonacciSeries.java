package com.Daily;

import java.util.Scanner;

public class FibonacciSeries {

    //1. without recursion
    /*public static void main(String[] args){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        System.out.print(n1+" "+n2);
        for(int i = 2; i < n; i ++){
            n3 = n2+n1;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }

    }*/

    // 2. Using recursion;
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        // Recursive call
        return fib(n - 1)
                + fib(n - 2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }


    }
}
