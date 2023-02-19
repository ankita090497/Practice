package com.java6.collection.cursor.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        System.out.println("Iterator demo using ArrayList : ");

        ArrayList list = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        System.out.print(list + " ");
        System.out.println();

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = (Integer) iterator.next();
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            } else {
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println(list);
    }
}
