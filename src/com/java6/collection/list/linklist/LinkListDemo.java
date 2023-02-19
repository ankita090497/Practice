package com.java6.collection.list.linklist;

import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        System.out.println("Linked List Demo : ");

        LinkedList list = new LinkedList();
        list.add("abc");
        list.add(102);
        System.out.println("Linked List 1 "+list);
        list.addFirst("105");
        System.out.println("Linked List 2 "+list);
        list.addLast("hii");
        list.set(1,"xyz");
        System.out.println("Linked List 3 "+list);
        System.out.println("Get Last : "+list.getLast());
        list.removeLast();
        list.add("python");
        list.add(3,"java");
        System.out.println("Linked List 4 "+list);



    }
}
