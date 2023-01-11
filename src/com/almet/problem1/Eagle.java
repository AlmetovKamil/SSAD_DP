package com.almet.problem1;

public class Eagle extends AnimalZoo {

    String eagleType = "Eagle";

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void entertain() {
        System.out.println(eagleType + " flying...");
    }
}
