package com.Daily;

import java.util.Scanner;

public class OddEven {

    // 1.
    /*public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();

        if(n%2 == 0){
            System.out.print("The entered number " + n + " is even");
        }else{
            System.out.print("The entered number " + n + " is odd");
        }
    }*/

    // 2. Print even/odd number between two number
    public static void main(String[] args){
        System.out.print("Enter the number n1: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println();
        System.out.print("Enter the number n2: ");
        int n2 = sc.nextInt();

        for(int i = n1; i <= n2 ; i++){
            if ((i^1) == (i + 1)){
               int temp = i;
               System.out.print(temp + " ");
            }
        }
    }

    //3. Using Bitwise XOR

    /*public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println();
        if((num ^ 1) == (num + 1))
            {
                System.out.println("The entered number "+ num +" is Even");
            }
        else
            {
                System.out.println("The entered number "+ num +" is Odd");
            }
        }*/
}
