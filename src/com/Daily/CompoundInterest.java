package com.Daily;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        //  P =  principal amount , T = time and R = rate

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        double p = sc.nextDouble();
        System.out.println();
        System.out.print("Enter the time : ");
        double t = sc.nextDouble();
        System.out.println();
        System.out.print("Enter the rate : ");
        double r = sc.nextDouble();
        System.out.println();
        double compoundInterest = 0;

        if((p != 0) && (t != 0) && (r != 0)){
           compoundInterest =  p * (Math.pow((1 + r / 100), t)) - p;
        }
        System.out.println("Compound Interest after " + t + " years: "+compoundInterest);
    }
}
