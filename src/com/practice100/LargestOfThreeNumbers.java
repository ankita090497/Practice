package com.practice100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestOfThreeNumbers {

    // Find Largest Of Three Numbers

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter three integers ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        // Using ternary operator
        int d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);

        System.out.println(d + " is the largest number.");

        // Using If-else

        if (a > b && a > c) {
            System.out.println(a + " is the largest number.");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest number.");
        } else if (c > a && c > b) {
            System.out.println(c + " is the largest number.");
        } else {
            System.out.println("Entered numbers are not distinct.");
        }


        //  Using Collections.max() method

        ArrayList<Integer> x = new ArrayList<>();
        x.add(a);
        x.add(b);
        x.add(c);

        // Printing the largest number
        System.out.println(Collections.max(x)
                + " is the largest number.");
    }
}

