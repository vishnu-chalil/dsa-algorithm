package com.learn.designpatterns.adapter;

class ClassCompositionMediaAdapter extends AdvancedMediaPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            playMp4(fileName);
        }
    }
}