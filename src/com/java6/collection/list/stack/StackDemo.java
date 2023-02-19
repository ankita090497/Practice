package com.java6.collection.list.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Stack initial capacity : " + stack.capacity());

        stack.push(1);
        stack.push("A");
        stack.push(25);
        System.out.println("Stack peek operation result : " + stack.peek());
        stack.push(45);
        System.out.println("Stack push operation result : " + stack);
        System.out.println("Stack search() operation result : " + stack.search("A"));
        System.out.println("Stack search() operation result2 : " + stack.search(5));
        System.out.println("Stack peek operation result : " + stack.pop());

    }
}
