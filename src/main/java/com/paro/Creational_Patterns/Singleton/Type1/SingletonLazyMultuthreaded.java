package com.paro.Creational_Patterns.Singleton.Type1;

public class SingletonLazyMultuthreaded {
    private static SingletonLazyMultuthreaded sc=null;
    private SingletonLazyMultuthreaded(){}

    public static synchronized SingletonLazyMultuthreaded getInstance() {
        if(sc==null){
            sc=new SingletonLazyMultuthreaded();
        }
        return sc;
    }
}
