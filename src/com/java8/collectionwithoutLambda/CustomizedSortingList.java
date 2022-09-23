package com.java8.collectionwithoutLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// CustomizedSortOrder = Descending order
class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer i1, Integer i2) {

        /*if (i1 > i2) {
            return -1;
        } else if (i1 < i2) {
            return 1;
        }else {
            return 0;
        }*/

        // short-cut using ternary operator
        return (i1 > i2)?-1 :(i1 < i2)?1 :0;
    }
}


public class CustomizedSortingList {

    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(0);
        arrayList.add(25);
        arrayList.add(15);
        arrayList.add(1);
        System.out.print("Before sorting : "+arrayList);
        Collections.sort(arrayList,new MyComparator());
        System.out.println();
        System.out.print("After sorting : "+arrayList);
    }
}
