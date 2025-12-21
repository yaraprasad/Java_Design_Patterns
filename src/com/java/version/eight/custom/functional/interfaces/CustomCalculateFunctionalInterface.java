package com.java.version.eight.custom.functional.interfaces;

@FunctionalInterface
public interface CustomCalculateFunctionalInterface {

    int calculate(int a, int  b);

    default  void printInfo(){
        System.out.println("Calculator Functional interface");
    }

    static  void version(){
        System.out.println("Version 1.0");
    }
}


