package com.shiva.designpatterns.creational.singleton;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-08-23 15:49
 **/


public class StopCloneSingleton {

    private static final StopCloneSingleton instance = new StopCloneSingleton();

    //private constructor to avoid client applications to use constructor
    private StopCloneSingleton(){}

    public static StopCloneSingleton getInstance(){
        return instance;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw  new CloneNotSupportedException("Singleton Class cloning not allowed");
    }


}
