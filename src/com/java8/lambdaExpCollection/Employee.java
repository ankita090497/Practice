package com.java8.lambdaExpCollection;

public class Employee {
    int empNo;
    String empName;

    public Employee(int empNo, String empName) {
        this.empNo = empNo;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return  empNo + " " + empName ;
    }
}
