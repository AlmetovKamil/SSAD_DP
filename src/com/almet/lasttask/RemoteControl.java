package com.almet.lasttask;

public class RemoteControl {
    private IMultimediaSystem system;

    public RemoteControl(IMultimediaSystem system) {
        this.system = system;
    }

    void playPopMusic() {
        system.playMusic(MusicType.POP);
    }

    void playDiscoMusic() {
        system.playMusic(MusicType.DISCO);
    }

    void playRockMusic() {
        system.playMusic(MusicType.ROCK);
    }

    void increaseVolume(int difference) {
        system.changeVolume(difference);
    }

    void decreaseVolume(int difference) {
        system.changeVolume(-difference);
    }

    void turnOnFlashingLights() {
        system.turnOnLights(LightType.FLASHING);
    }

    void turnOffFlashingLights() {
        system.turnOffLights(LightType.FLASHING);
    }

    void turnOnBacklights() {
        system.turnOnLights(LightType.BACK);
    }

    void turnOffBacklights() {
        system.turnOffLights(LightType.BACK);
    }

    void discoMode() {
        increaseVolume(85);
        turnOnFlashingLights();
        turnOnBacklights();
        playDiscoMusic();
    }

}
