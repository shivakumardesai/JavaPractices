package com.shiva.designpatterns.creational.factory.method;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-09-09 15:36
 **/


public class DecodedImage {
    private String image;

    public DecodedImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return image + ": is decoded";
    }
}
