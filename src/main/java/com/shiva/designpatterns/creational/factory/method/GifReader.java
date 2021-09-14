package com.shiva.designpatterns.creational.factory.method;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-09-09 15:37
 **/


public class GifReader implements ImageReader {
    private DecodedImage decodedImage;

    public GifReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return null;
    }
}
