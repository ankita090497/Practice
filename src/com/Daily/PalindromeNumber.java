package com.Daily;

import java.util.Scanner;

public class PalindromeNumber {

    // 1. Reverse the original number/String
    /*public static void main(String[] args){
        String reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        String original = sc.nextLine();
        original = original.toLowerCase();
        int length = original.length();
        for(int i = length-1; i >= 0; i-- ){
          reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.print(original +" is palindrome");
        }else{
            System.out.print(original +" is not palindrome");
        }
    }*/

    // 2.

    /*public static void main(String[] args){

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int temp = number;
        while (number > 0){
            sum = (sum * 10) + (number%10);
            number = number/10;
        }
        if(temp == sum){
            System.out.print("The entered number "+ temp +" is a palindrome number");
        }else{
            System.out.print("The entered number "+ temp +" is not palindrome");
        }
    }*/

    //3. Print palindrome number between two number

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n1: ");
        int n1 = sc.nextInt();
        System.out.println();
        System.out.print("Enter the number n2: ");
        int n2 = sc.nextInt();

        for(int i = n1; i <= n2; i++){
            boolean temp = checkPalindrome(i);
            if(checkPalindrome(i))
                System.out.print(i+" ");
        }
    }
    public static boolean checkPalindrome(int num){
        int sum = 0;
        int temp = num;
        while (num > 0){
            sum = (sum*10) + (num%10);
            num = num/10;
        }
        if(temp == sum)
            return true;
        else
            return false;
    }
}
