package com.java8.collectionwithoutLambda;

import java.util.TreeSet;

// CustomizedSortOrder = Descending order

public class CustomizedSortTreeSet {

    public static void main(String[] args){
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(12);
        treeSet.add(10);
        treeSet.add(45);
        treeSet.add(5);
        treeSet.add(1);
        System.out.print("Without descendingSet(): " +treeSet);
        TreeSet<Integer> descendingtreeSet = (TreeSet<Integer>) treeSet.descendingSet();
        System.out.println();
        System.out.print("With descendingSet(): " +descendingtreeSet);
    }
}
