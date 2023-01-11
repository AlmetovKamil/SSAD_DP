package com.almet.adapter;

public class Audio implements AudioPlayer {
    @Override
    public void playMP3() {
        System.out.println("Playing MP3 file...");
    }
}
