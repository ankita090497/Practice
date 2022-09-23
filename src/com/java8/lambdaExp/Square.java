package com.java8.lambdaExp;

@FunctionalInterface
interface Square {
    public void squareRoot(int i);
}
class SquareTest {

    public static void main(String[] a) {
        //Square square = (a) ->  a * a;
        Square s = (i) -> System.out.println(i * i);
        s.squareRoot(10);
    }
}