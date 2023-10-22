package edu.neu.csye6200;

public class ServiceItem extends Item {
    private String serviceType;

    public ServiceItem(String csvData) {
        String[] data = csvData.split(",");
        this.id = data[0];
        this.name = data[1];
        this.price = Double.parseDouble(data[2]);
        this.serviceType = data[3];
    }

    @Override
    public String toString() {
        return "ServiceItem: ID=" + id + ", Name=" + name + ", Price=" + price + ", ServiceType=" + serviceType;
    }
}