package com.java8.collectionwithoutLambda;

// CustomizedSortOrder = Descending


import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class CustomizedSortTreeMap {

    public static void main(String[] args){
        Map<Integer, String> map = new TreeMap<Integer,String>(Collections.reverseOrder());
        map.put(1,"abc");
        map.put(4,"pqw");
        map.put(3,"cbvn");
        map.put(2,"xyz");
        map.put(2,"sdf");
        System.out.print("Before Sorting : "+map);
        System.out.println();
        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        // Traverse map and print elements
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
    }
}
