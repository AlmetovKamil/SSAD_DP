package com.almet.problem1;

public abstract class AnimalZoo {
    public String name;

    public AnimalZoo(String name) {
        this.name = name;
    }

    public abstract void entertain();

    public void addToZoo() {
        Zoo zoo = Zoo.getInstance();
        zoo.addAnimal(this);
    }

    public void printMe() {
        System.out.println("I'm " + name);
    }

}
