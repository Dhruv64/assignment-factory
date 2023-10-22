package edu.neu.csye6200;

public class FoodItem extends Item {
    private String expiryDate;

    public FoodItem(String csvData) {
        String[] data = csvData.split(",");
        this.id = data[0];
        this.name = data[1];
        this.price = Double.parseDouble(data[2]);
        this.expiryDate = data[3];
    }

    @Override
    public String toString() {
        return "FoodItem: ID=" + id + ", Name=" + name + ", Price=" + price + ", ExpiryDate=" + expiryDate;
    }
}