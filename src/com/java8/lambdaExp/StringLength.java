package com.java8.lambdaExp;

import java.util.Scanner;

public interface StringLength {
    public int getLength(String s);
}


class StringLengthTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String tempStr = scanner.nextLine();
        StringLength stringLength = str -> str.length();
        System.out.println("Length of given string "  + tempStr + " is : "+stringLength.getLength(tempStr));
    }
}
