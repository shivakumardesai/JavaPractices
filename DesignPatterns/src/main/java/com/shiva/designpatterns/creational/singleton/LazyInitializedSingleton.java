package com.shiva.designpatterns.creational.singleton;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-08-23 14:49
 **/


public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
