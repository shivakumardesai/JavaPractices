package com.shiva.designpatterns.structural.adapter.mediaplayer;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-08-23 17:37
 **/


public class Mp4Player implements  AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //DO Nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
