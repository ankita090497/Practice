package com.java8.lambdaExpCollection;

import java.util.TreeSet;

// CustomizedSortOrder = Descending using lambda exp
public class CustomizedSortTreeSetLambda {

    public static void main(String[] args){
        TreeSet<Integer> treeSet = new TreeSet<Integer>((i1,i2) -> (i1 > i2)?-1 : (i1 < i2)?1 : 0);
        treeSet.add(12);
        treeSet.add(10);
        treeSet.add(45);
        treeSet.add(5);
        treeSet.add(1);
        System.out.print(treeSet);

    }
}
