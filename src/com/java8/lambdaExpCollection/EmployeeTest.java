package com.java8.lambdaExpCollection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {
    public static void main(String[] args){
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(25,"Dhun"));
        list.add(new Employee(15,"Karan"));
        list.add(new Employee(45,"Arnav"));
        list.add(new Employee(10,"Rahi"));
        list.add(new Employee(5,"Sujata"));
        System.out.print("Before Sorting : "+list);
        System.out.println();
        Collections.sort(list,(e1,e2) -> (e1.empNo < e2.empNo)?-1 : (e1.empNo > e2.empNo)?1 : 0);
        System.out.print("After Sorting in ascending order : "+list);
        System.out.println();
        Collections.sort(list,(e1,e2) -> (e1.empNo > e2.empNo)?-1 : (e1.empNo < e2.empNo)?1 : 0);
        System.out.print("After Sorting in descending order : "+list);
    }
}
