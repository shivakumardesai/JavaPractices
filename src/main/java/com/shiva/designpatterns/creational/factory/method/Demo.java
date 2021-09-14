package com.shiva.designpatterns.creational.factory.method;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-09-09 15:39
 **/


public class Demo {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;
        String image = "jpeg";
        String format = image.substring(image.indexOf('.') + 1, (image.length()));
        if (format.equals("gif")) {
            reader = new GifReader(image);
        }
        if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }
        assert reader != null;
        decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);
    }
}
