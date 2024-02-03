package com.learn.designpatterns.adapterpattern;

// The adaptee class
class AdvancedMediaPlayer {
    void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }

    void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}