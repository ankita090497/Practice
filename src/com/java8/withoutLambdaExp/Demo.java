package com.java8.withoutLambdaExp;

public class Demo implements A {

    @Override
    public void m1() {
        System.out.println("Normal implementation");
    }

    @Override
    public void add(int a, int b) {
        System.out.println("Sum of a and b : " +(a+b));
    }

    @Override
    public int getLength(String s) {
        return s.length();
    }

    @Override
    public int squareIt(int a) {
        return a * a;
    }

}
