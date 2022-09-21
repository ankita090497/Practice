package com.Daily;

import java.util.Scanner;

public class CountDigit {

    //1. Converting given number to string solution to count digits in an integer
    /*public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit =  ");
        int a = sc.nextInt();

        String temp = Integer.toString(a);
        int[] numbers = new int[temp.length()];
        System.out.print(""Number of digits : "+numbers.length);

    }*/

    //2. Simple Iterative Solution
    /*static int countDigit(int a){
        int result = 0;

        while (a > 0){
            a = a/10;
            result ++;
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit =  ");
        int a = sc.nextInt();

        System.out.println("Number of digits : "+countDigit(a));
    }*/

    //3. Recursion Call

    static int countDigit(long n)
    {
        if (n/10 == 0) {
            return 1;
        }
        return 1 + countDigit(n / 10);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit =  ");
        long n = sc.nextLong();

        System.out.println("Number of digits : "+countDigit(n));
    }


}
