package com.shiva.designpatterns.structural.adapter.mediaplayer;

/**
 * @author : Shivakumar Desai
 * @project : DesignPatterns
 * @created : 2021-08-23 17:36
 **/


public class VlcPlayer implements  AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //doNothing
    }
}
