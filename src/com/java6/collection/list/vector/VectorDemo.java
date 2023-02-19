package com.java6.collection.list.vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector vector = new Vector();
        System.out.println("Initial capacity of vector : " + vector.capacity());

        for (int i = 1; i <= 10; i++) {
            vector.addElement(i);
        }
        vector.addElement("A");
        System.out.println("Capacity Increase : " + vector.capacity());
        System.out.println(vector);
        vector.removeElement("A");
        vector.removeElement(2);
        System.out.println(vector);
    }
}
