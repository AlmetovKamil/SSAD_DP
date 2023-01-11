package com.almet.adapter;

public class MP3toMP4Adapter implements MediaPlayer {
    AudioPlayer audioPlayer;

    public MP3toMP4Adapter(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void playMP4() {
        System.out.println("Change MP3 to MP4 using Adapter");
        audioPlayer.playMP3();
    }
}
