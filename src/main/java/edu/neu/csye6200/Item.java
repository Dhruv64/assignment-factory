package edu.neu.csye6200;

public abstract class Item {
    protected String id;
    protected String name;
    protected double price;

    @Override
    public abstract String toString();
}
