package com.java8.collectionwithoutLambda;

import java.util.TreeSet;

// DefaultNaturalSortOrder = Ascending order

public class NaturalSortTreeSet {
    public static void main(String[] args){
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(12);
        treeSet.add(10);
        treeSet.add(45);
        treeSet.add(5);
        treeSet.add(1);
        System.out.print(treeSet);
    }
}
