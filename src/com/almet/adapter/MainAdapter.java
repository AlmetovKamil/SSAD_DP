package com.almet.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        PlayerDevice playerDevice = new PlayerDevice();
        MediaPlayer mediaPlayer = new Media();
        AudioPlayer audioPlayer = new Audio();
        playerDevice.playMP4(mediaPlayer);
        MP3toMP4Adapter adapter = new MP3toMP4Adapter(audioPlayer);
        playerDevice.playMP4(adapter);
    }
}
