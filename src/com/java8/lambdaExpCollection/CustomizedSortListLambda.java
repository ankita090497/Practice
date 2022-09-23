package com.java8.lambdaExpCollection;

import java.util.ArrayList;
import java.util.Collections;

// CustomizedSortOrder = Descending order using lambda expression

public class CustomizedSortListLambda {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(0);
        arrayList.add(50);
        arrayList.add(42);
        arrayList.add(12);
        arrayList.add(22);
        System.out.print("Before sorting : "+arrayList);
        Collections.sort(arrayList, (i1,i2) -> (i1>i2)?-1 : (i1<i2)?1 : 0);
        System.out.println();
        System.out.print("After sorting : "+arrayList);

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("abc");
        stringArrayList.add("pqr");
        stringArrayList.add("ab");
        stringArrayList.add("xyz");
        stringArrayList.add("a");
        stringArrayList.add("hmn");
        System.out.println();
        System.out.print("Before string sorting : "+stringArrayList);
        Collections.sort(stringArrayList, (aStr,bStr) -> aStr.compareTo(bStr));
        System.out.println();
        System.out.print("After string sorting in ascending order: "+stringArrayList);

        Collections.sort(stringArrayList, (aStr,bStr) -> bStr.compareTo(aStr));
        System.out.println();
        System.out.print("After string sorting in descending order: "+stringArrayList);
    }
}
