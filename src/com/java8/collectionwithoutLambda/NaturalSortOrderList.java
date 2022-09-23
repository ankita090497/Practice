package com.java8.collectionwithoutLambda;

import java.util.ArrayList;
import java.util.Collections;

public class NaturalSortOrderList {

    // NaturalSortOrder = Ascending order
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(0);
        arrayList.add(25);
        arrayList.add(15);
        arrayList.add(1);
        System.out.print("Before sorting : "+arrayList);
        Collections.sort(arrayList);
        System.out.println();
        System.out.print("After sorting : "+arrayList);
    }
}
