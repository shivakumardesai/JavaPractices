package com.shiva.designpatterns.creational.singleton;

import java.io.Serializable;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-08-23 14:54
 **/


public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
    //To Solve the Serialization Problem of getting different HashCode
    //https://docs.oracle.com/javase/8/docs/platform/serialization/spec/input.html
    protected Object readResolve() {
        return getInstance();
    }

}
