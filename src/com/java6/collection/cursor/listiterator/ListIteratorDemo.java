package com.java6.collection.cursor.listiterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        System.out.println("List Iterator demo using ArrayList !!!!");

        ArrayList list = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.print("Array List : " + list);
        System.out.println();

        ListIterator itr = list.listIterator();

        while (itr.hasNext()) {
            Integer integer = (Integer) itr.next();

            if (integer.equals(4)) {
                itr.remove();
            } else if (integer.equals(5)) {
                itr.add(50);
            } else if (integer.equals(8)) {
                itr.set(12);
            }
        }
        System.out.println("Array List with updation : " + list);
    }
}
