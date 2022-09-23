package com.java8.withoutLambdaExp;

public class Test {
    public static void main(String[] args){
        A a = new Demo();
         a.m1(); // no argument
        a.add(10,20); // int- argument
        a.add(25,2563); // int- argument
        System.out.println("length of provided string.  "+a.getLength("hello......"));
        System.out.println("Square of a.  "+a.squareIt(10));

    }
}
