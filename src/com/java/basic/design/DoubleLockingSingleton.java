package com.java.basic.design;

import java.io.Serializable;

public class DoubleLockingSingleton implements Serializable,Cloneable {

    private static DoubleLockingSingleton instance;

    private DoubleLockingSingleton(){
            if(instance!=null){ //protects from Reflection
                throw new IllegalArgumentException("Singleton object already created");
            }
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
    protected Object clone() throws CloneNotSupportedException{//prevents clonning
         throw new CloneNotSupportedException("Singleton clone not supported");
    }

    public Object readSolve(){
        return instance;
    }
}
