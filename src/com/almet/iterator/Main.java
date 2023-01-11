package com.almet.iterator;

public class Main {
    public static void main(String[] args) {
        TreasureChest chest = new TreasureChest();
        chest.magicalItems.add(new MagicalItem("ring"));
        chest.magicalItems.add(new MagicalItem("potions"));
        chest.magicalItems.add(new MagicalItem("weapons"));
        while (chest.hasNext()) {
            System.out.println(chest.next());
        }

    }
}
