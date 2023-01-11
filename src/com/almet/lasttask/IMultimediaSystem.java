package com.almet.lasttask;

public interface IMultimediaSystem {
    void playMusic(MusicType type);
    void changeVolume(int difference);
    void turnOnLights(LightType type);
    void turnOffLights(LightType type);

}
