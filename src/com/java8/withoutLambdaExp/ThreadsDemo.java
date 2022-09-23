package com.java8.withoutLambdaExp;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<10 ; i++){
            System.out.println("Child thread called.."); // Job of thread
        }
    }
}

public class ThreadsDemo {
    public static void main(String[] args){
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        for(int i = 0; i<10 ; i++){
            System.out.println("Main thread called");
        }

    }
}
