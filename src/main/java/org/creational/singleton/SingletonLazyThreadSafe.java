package org.creational.singleton;

public class SingletonLazyThreadSafe {

    private static class LazyLoad {
        static final SingletonLazyThreadSafe INSTANCE = new SingletonLazyThreadSafe();
    }

    private SingletonLazyThreadSafe(){}
    public static SingletonLazyThreadSafe getInstance(){
        return LazyLoad.INSTANCE;
    }
}
