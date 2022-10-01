package com.Daily;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        // Simple Interest = (P x T x R)/100  where P =  principal amount
                                                   // T = time and R = rate
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        float p = sc.nextFloat();
        System.out.println();
        System.out.print("Enter the time : ");
        float t = sc.nextFloat();
        System.out.println();
        System.out.print("Enter the rate : ");
        float r = sc.nextFloat();
        float interest = 0;

        if ((p != 0) && (t != 0) && (r != 0)){
            interest = (p * t * r)/100;
        }
        System.out.println();
        System.out.print("Simple interest = "+interest);

    }
}
