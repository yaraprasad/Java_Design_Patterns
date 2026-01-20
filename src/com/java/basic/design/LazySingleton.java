package com.java.basic.design;

public class LazySingleton {


    private static LazySingleton instance;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(instance==null){
            instance= new LazySingleton();
        }
        return  instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return null;
    }
}
