package com.java6.collection.cursor.listiterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo1 {
    public static void main(String[] args) {
        System.out.println("List Iterator demo using LinkedList !!!!!");

        LinkedList list = new LinkedList();
        list.add("abc");
        list.add("xyz");
        list.add("pqr");
        list.add("mno");

        System.out.println("Linked List : "+list);

        ListIterator iterator = list.listIterator();

        while (iterator.hasNext()){
            String s = (String) iterator.next();

            if(s.equals("pqr")){
                iterator.remove();
            }else if(s.equals("abc")){
                iterator.set(1254);
            }else if (s.equals("xyz")) {
                iterator.add(9497);
            }
        }
        System.out.print("List : "+list);
    }
}
