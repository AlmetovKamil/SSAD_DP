package com.almet.chain;

public interface Orc {
    default Orc appendAction(Orc next) {
        return () -> {
            Orc.this.action();
            next.action();
        };
    }

    void action();

    static Orc loudKing() {
        return () -> System.out.println("King louds!");
    }

    static Orc loudOfficer() {
        return () -> System.out.println("Officer louds!");
    }

    static Orc loudSoldier() {
        return () -> System.out.println("Soldier louds!");
    }
}
