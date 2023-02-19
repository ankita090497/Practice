package com.java6.collection.list.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("A");
        al.add("abc");
        al.add(10);
        al.add(null);
        System.out.println("Print the added object in ArrayList : " + al);
        al.remove(2);
        System.out.println("After removing object : " + al);
        al.add(2, "M");
        al.add(20);
        System.out.println("ArrayList : " + al);

    }
}
