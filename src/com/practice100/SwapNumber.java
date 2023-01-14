package com.practice100;

import java.util.Scanner;

public class SwapNumber {

    // Swap Numbers without using 3rd variable
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Before Swapping\na = " + a + "\nb = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping\na = " + a + "\nb = " + b);

    }

}
