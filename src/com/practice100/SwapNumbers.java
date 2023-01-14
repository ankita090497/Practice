package com.practice100;

import java.util.Scanner;

public class SwapNumbers {

    // Swap Numbers using 3rd variable

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Before Swapping\na = " + a + "\nb = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping\na = " + a + "\nb = " + b);
    }
}
