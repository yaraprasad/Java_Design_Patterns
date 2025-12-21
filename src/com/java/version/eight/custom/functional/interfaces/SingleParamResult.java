package com.java.version.eight.custom.functional.interfaces;

public class SingleParamResult {

    public static void main(String[] args) {

        SingleParamInterface square = a -> a*a;

        SingleParamInterface cube = a -> a*a*a;

        SingleParamInterface squareRoot = a -> Math.sqrt(a);

        SingleParamInterface additiveInverse = a -> a*-1;

        SingleParamInterface multiplicativeInverse = a -> (1/a);

        System.out.println(square.compute(5));
        System.out.println(cube.compute(5));
        System.out.println(squareRoot.compute(5));
        System.out.println(additiveInverse.compute(5));
        System.out.println(multiplicativeInverse.compute(5));

    }
}
