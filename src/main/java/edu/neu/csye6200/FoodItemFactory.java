package edu.neu.csye6200;

public class FoodItemFactory {
    public static FoodItem createItem(String csvData) {
        return new FoodItem(csvData);
    }
}