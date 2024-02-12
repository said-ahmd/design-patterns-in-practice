package org.creational.singleton;

public class SingletonEgerNotSafe {

    private static SingletonEgerNotSafe instance = new SingletonEgerNotSafe();
    private SingletonEgerNotSafe(){}
    public static SingletonEgerNotSafe getInstance(){
        return instance;
    }
}
