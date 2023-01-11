package com.almet.lasttask;

public class MultimediaSystem implements IMultimediaSystem {
    private int volume = 0;

    @Override
    public void playMusic(MusicType type) {
        System.out.println("Playing " + type.toString() + " music...");
    }

    @Override
    public void changeVolume(int difference) {
        volume += difference;
        System.out.println("Volume now is " + volume);
    }

    @Override
    public void turnOnLights(LightType type) {
        System.out.println(type.toString() + " lights are turned on!");
    }

    @Override
    public void turnOffLights(LightType type) {
        System.out.println(type.toString() + " lights are turned off!");
    }
}
