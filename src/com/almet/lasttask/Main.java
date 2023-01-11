package com.almet.lasttask;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(new MultimediaSystem());
        remoteControl.discoMode();
    }
}
