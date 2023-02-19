package com.java6.collection.cursor.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

    public static void main(String[] args) {
        System.out.println("Enumeration demo using vector ");

        Vector vector = new Vector();
        for (int i = 1; i <= 10; i++) {
            vector.addElement(i);
        }
        System.out.println("Vector output : " + vector);

        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            Integer integer = (Integer) enumeration.nextElement();
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
        System.out.println(vector);
    }
}
