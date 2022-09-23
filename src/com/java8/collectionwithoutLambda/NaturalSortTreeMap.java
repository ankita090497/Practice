package com.java8.collectionwithoutLambda;

import java.util.TreeMap;

// NaturalSortOrder = Ascending order
public class NaturalSortTreeMap {

    public static void main(String[] args){
        TreeMap<Integer, String> map = new TreeMap<Integer,String>();
        map.put(1,"abc");
        map.put(4,"pqw");
        map.put(3,"cbvn");
        map.put(2,"xyz");
        map.put(2,"sdf");

        System.out.print(map);
    }
}
