package edu.neu.csye6200;

import java.util.*;
public class Store extends AbstractStore {
    @Override
    protected void loadItems() {
        try {
            for (String data : FileUtil.readCustomFile("src\\main\\java\\edu\\n" + //
                    "eu\\csye6200\\FoodItemCSV.txt")) {
                items.add(FoodItemFactory.createItem(data));
            }
            for (String data : FileUtil.readCustomFile("src\\main\\java\\edu\\n" + //
                    "eu\\csye6200\\ElectronicItemCSV.txt")) {
                items.add(ElectronicItemFactory.getInstance().createItem(data));
            }
            for (String data : FileUtil.readCustomFile("src\\main\\java\\edu\\n" + //
                    "eu\\csye6200\\ServiceItemCSV.txt")) {
                items.add(ServiceItemFactory.getInstance().createItem(data));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void sortItemsById() {
        items.sort(Comparator.comparing(i -> i.id));
    }

    @Override
    protected void sortItemsByName() {
        items.sort(Comparator.comparing(i -> i.name));
    }

    @Override
    protected void sortItemsByPrice() {
        items.sort(Comparator.comparingDouble(i -> i.price));
    }

    public void demo() {
        loadItems();
        System.out.println("Before Sorting:");
        items.forEach(System.out::println);

        sortItemsById();
        System.out.println("\nSorted by ID:");
        items.forEach(System.out::println);

        sortItemsByName();
        System.out.println("\nSorted by Name:");
        items.forEach(System.out::println);

        sortItemsByPrice();
        System.out.println("\nSorted by Price:");
        items.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Store().demo();
    }
}