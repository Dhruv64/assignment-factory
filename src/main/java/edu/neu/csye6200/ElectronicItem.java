package edu.neu.csye6200;

public class ElectronicItem extends Item {
    private String brand;

    public ElectronicItem(String csvData) {
        String[] data = csvData.split(",");
        this.id = data[0];
        this.name = data[1];
        this.price = Double.parseDouble(data[2]);
        this.brand = data[3];
    }

    @Override
    public String toString() {
        return "ElectronicItem: ID=" + id + ", Name=" + name + ", Price=" + price + ", Brand=" + brand;
    }
}
