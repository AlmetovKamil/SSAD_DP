package com.almet.problem1;

public class MainSingletone {
    public static void main(String[] args) {
        AnimalZoo cat = new Cat("cat");
        AnimalZoo duck = new Duck("duck");
        AnimalZoo eagle = new Eagle("eagle");
        cat.addToZoo();
        duck.addToZoo();
        eagle.addToZoo();
        Zoo zoo = Zoo.getInstance();
        zoo.displayAnimals();

    }
}
