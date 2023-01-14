package com.practice100;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        Scanner scanner = new Scanner(System.in);

        // Convert fahrenhit to Celsius formula : ((fahrenheit - 32) * 5)/9;
        System.out.println("Enter temperatue in Fahrenheit :");
        fahrenheit = scanner.nextFloat();
        System.out.print("Fahrenheit : " + fahrenheit + "F");

        System.out.println();
        celsius = ((fahrenheit - 32) / 1.8);
        System.out.println("Temperatue in Celsius : " + celsius + "C");


        // celsius to fahrenheit formula : ((celsius * 9/5) + 32)
        System.out.println("Enter temperatue in Celsius : ");
        celsius = scanner.nextDouble();
        System.out.print("Celsius : " + celsius + "C");

        System.out.println();
        fahrenheit = ((celsius * 1.8) + 32);
        System.out.println("Temperatue in Fahrenheit : " + fahrenheit + "F");

    }
}
