package com.almet.problem1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<AnimalZoo> animalList = new ArrayList<>();
    private static final Zoo instance = new Zoo();

    private Zoo() {}

    public static Zoo getInstance() {
        return instance;
    }

    public void addAnimal(AnimalZoo animalZoo) {
        animalList.add(animalZoo);
    }

    public void displayAnimals() {
        animalList.forEach(AnimalZoo::printMe);
    }
}
