package com.shiva.designpatterns.structural.adapter.mobilecharger;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-08-23 17:42
 **/


public interface SocketAdapter {
    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
