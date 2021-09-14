package com.shiva.designpatterns.structural.proxy.internet;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-09-03 16:54
 **/


public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to "+ serverHost);
    }
}
