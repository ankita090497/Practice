package com.Daily;

import java.util.Scanner;

public class PrimeNumber {

    //1. Check prime or not for particular number
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        int temp = 0;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                temp++;
            }
        }
        if (temp > 0) {
            System.out.println(n + " is not prime number");
        } else {
            System.out.println(n + " is prime number");
        }
    }

    //2. Prime number between 2 number
    /*public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        int temp = 0;

        for(int i = 2; i <= n; i++){
            for(int j = 2; j< i-1; j++){
                if(i%j == 0){
                    temp ++;
                }
            }
            if(temp == 0){
                System.out.print(" "+i);
            }else{
                temp = 0;
            }
        }
    }*/

}
