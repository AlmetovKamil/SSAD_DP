package com.almet.chain;

public class Main {

    public static void main(String[] args) {
        Orc orcChain = Orc.loudKing()
                .appendAction(Orc.loudOfficer())
                .appendAction(Orc.loudSoldier())
                ;
        orcChain.action();
    }

}
