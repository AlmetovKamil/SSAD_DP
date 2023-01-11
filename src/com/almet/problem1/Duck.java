package com.almet.problem1;

public class Duck extends AnimalZoo {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void entertain() {
        System.out.println("KRYA-KRYA");
    }
}
