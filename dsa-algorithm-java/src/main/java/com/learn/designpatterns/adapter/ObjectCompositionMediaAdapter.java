package com.learn.designpatterns.adapter;

// The adapter class using object composition
class ObjectCompositionMediaAdapter implements MediaPlayer {
    // The adaptee object
    private AdvancedMediaPlayer advancedMediaPlayer;

    // The constructor that initializes the adaptee object
    public ObjectCompositionMediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new AdvancedMediaPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new AdvancedMediaPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}