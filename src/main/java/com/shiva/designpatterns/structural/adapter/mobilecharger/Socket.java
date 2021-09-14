package com.shiva.designpatterns.structural.adapter.mobilecharger;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-08-23 17:42
 **/


public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
