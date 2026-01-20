package com.java.basic.design;

public class DoubleLockingSingleton {

    private static DoubleLockingSingleton instance;

    private DoubleLockingSingleton(){

    }

    public static DoubleLockingSingleton getInstance(){
        if(instance==null){
            synchronized (DoubleLockingSingleton.class){
                    if(instance==null) {
                        instance = new DoubleLockingSingleton();
                    }
            }
        }
        return  instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return null;
    }
}
