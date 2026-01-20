package com.java.basic.design;

public class ThreadSingleton {

    private static ThreadSingleton instance;

    private ThreadSingleton(){

    }

    public static synchronized  ThreadSingleton getInstance(){
        if(instance==null){
            instance= new ThreadSingleton();
        }
        return  instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return null;
    }
}
