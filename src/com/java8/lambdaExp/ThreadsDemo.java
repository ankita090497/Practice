package com.java8.lambdaExp;

public class ThreadsDemo {

    public static void main(String[] args){
        Runnable runnable = () -> {
            for (int i = 0; i<5 ; i++){
                System.out.println(" Lambda : Child thread job called .......");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i<5 ; i++){
            System.out.println("Lambda : Main thread job called.......");
        }
    }
}
