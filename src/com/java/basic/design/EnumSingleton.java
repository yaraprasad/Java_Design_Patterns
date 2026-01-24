package com.java.basic.design;

public enum EnumSingleton {
    INSTANCE;

    public void perform(){
        System.out.println("doing some task!" +this.hashCode());
    }
}

