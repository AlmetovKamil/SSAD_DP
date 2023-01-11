package com.almet.bridge;

public class MainBridge {

    public static void main(String[] args) {
        CarWorkshop carWorkshop = new CarWorkshop("BMW");
        carWorkshop.setOperation(message -> {
            System.out.println("Assemble");
            System.out.println(message);
        });
        carWorkshop.startFiltering("A->");
        carWorkshop.setOperation(message -> {
            System.out.println("Dissamble");
            System.out.println(message);
        });
        carWorkshop.startFiltering("B->");
    }
}
