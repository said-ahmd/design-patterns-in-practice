package org.creational.singleton;

public class Main {
    public static void main(String[] args) {
//        SingletonEgerNotSafe singletonEgerNotSafe = SingletonEgerNotSafe.getInstance();
//        System.out.println(singletonEgerNotSafe);
//
//        SingletonEgerNotSafe singletonEgerNotSafe1 = SingletonEgerNotSafe.getInstance();
//        System.out.println(singletonEgerNotSafe1);
//        for (int i=0; i<5; ++i){
//            new Thread(()->{
//                SingletonEgerNotSafe instance = SingletonEgerNotSafe.getInstance();
//                System.out.println(instance.hashCode());
//            }).start();
//        }


        ////////////

//        SingletonLazyThreadSafe singletonLazyThreadSafe = SingletonLazyThreadSafe.getInstance();
//        System.out.println(singletonLazyThreadSafe.hashCode());
//
//        SingletonLazyThreadSafe singletonLazyThreadSafe1 = SingletonLazyThreadSafe.getInstance();
//        System.out.println(singletonLazyThreadSafe1.hashCode());

        for (int i=0; i<10; ++i){
            new Thread(()->{
                SingletonEgerNotSafe instance = SingletonEgerNotSafe.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }
    }
}