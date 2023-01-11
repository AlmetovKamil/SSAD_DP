package com.almet.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TreasureChest implements Iterator<MagicalItem> {

    List<MagicalItem> magicalItems = new ArrayList<>();
    int index = 0;

    @Override
    public boolean hasNext() {
        return index < magicalItems.size();
    }

    @Override
    public MagicalItem next() {
        return magicalItems.get(index++);
    }
}
