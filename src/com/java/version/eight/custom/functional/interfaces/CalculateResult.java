package com.java.version.eight.custom.functional.interfaces;

public class  CalculateResult{

    public static void main(String[] args) {


        //Lambda expression implementation
        CustomCalculateFunctionalInterface add = (a,b) -> a+b;

        CustomCalculateFunctionalInterface subtract = (a,b) -> a-b;

        CustomCalculateFunctionalInterface multiply = (a,b) -> a*b;

        System.out.println(add.calculate(10,5));
        System.out.println(subtract.calculate(10,5));
        System.out.println(multiply.calculate(10,5));
    }
}
