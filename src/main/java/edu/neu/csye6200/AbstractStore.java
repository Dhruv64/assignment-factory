package edu.neu.csye6200;

import java.util.*;

public abstract class AbstractStore {
    protected List<Item> items;

    public AbstractStore() {
        items = new ArrayList<>();
    }

    protected abstract void loadItems();
    protected abstract void sortItemsById();
    protected abstract void sortItemsByName();
    protected abstract void sortItemsByPrice();
}