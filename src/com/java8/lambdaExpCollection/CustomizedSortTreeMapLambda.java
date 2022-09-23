package com.java8.lambdaExpCollection;


// CustomizedSortOrder = Descending using lambda exp
import java.util.TreeMap;

public class CustomizedSortTreeMapLambda {

    public static void main(String[] args){
        TreeMap<Integer, String> map = new TreeMap<Integer, String>( (i1,i2) -> (i1 > i2)?-1 : (i1 < i2)?1 : 0);
        map.put(1,"abc");
        map.put(5,"prt");
        map.put(8,"abj");
        map.put(10,"xyz");
        map.put(4,"qwe");
        map.put(0,"rty");
        System.out.print(map);
    }
}
