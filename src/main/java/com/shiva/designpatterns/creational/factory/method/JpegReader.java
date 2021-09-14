package com.shiva.designpatterns.creational.factory.method;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-09-09 15:38
 **/


public class JpegReader implements ImageReader{
    private DecodedImage decodedImage;

    public JpegReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return null;
    }
}
