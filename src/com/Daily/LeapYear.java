package com.Daily;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){

        System.out.print("Enter the year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // 1st condition check- It is century leap year
        // 2nd condition check- It is leap year and not
        // century year

        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){

            System.out.println();
            System.out.print(year +" is leap year");
        }else{

            System.out.println();
            System.out.print(year +" is not leap year");
        }
    }
}
