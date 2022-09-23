package com.java8;

@FunctionalInterface
public interface InterfaceFun {

    // example of functional Interface
    public void m1(); // abstract method

    default void m2(){ // non-abstract method

    }

    public static void m3(){ // non-abstract method

    }

}
