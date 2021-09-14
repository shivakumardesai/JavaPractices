package com.shiva.designpatterns.structural.proxy.internet;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-09-03 16:57
 **/


public class Client {
    public static void main (String[] args) {
        Internet internet = new ProxyInternet();
        try      {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
