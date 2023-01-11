package com.almet.problem1;

public class Cat extends AnimalZoo {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void entertain() {
        System.out.println("MEOWWWW");
    }
}
