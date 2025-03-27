package com.bridgelabz.warehousemanagement;

// abstract generic class representing a warehouse item
abstract class WarehouseItem {
    // Attributes
    private String itemCode;
    private final String name;
    private final double price;

    // Constructor
    public WarehouseItem(String itemCode, String name, double price) {
        this.itemCode =itemCode;
        this.name = name;
        this.price = price;
    }

    // getter method for itemCode
    public String getItemCode() {
        return itemCode;
    }

    // getter method for name
    public String getName() {
        return name;
    }

    // getter method for price
    public double getPrice() {
        return price;
    }

    // method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: "+ itemCode + "| Item Name: " + name + "| Price: " + price);
    }
}

// Classes for specific item types
class Electronics extends WarehouseItem {
    // Attributes
    private String itemCode;
    private String name;
    private double price;

    // Constructor
    Electronics(String itemCode, String name, double price) {
        super(itemCode, name, price);
    }
}

class Groceries extends WarehouseItem {
    // Attributes
    private String itemCode;
    private String name;
    private double price;

    // Constructor
    Groceries(String itemCode, String name, double price) {
        super(itemCode, name, price);
    }
}

class Furniture extends WarehouseItem {
    // Attributes
    private String itemCode;
    private String name;
    private double price;

    // Constructor
    Furniture(String itemCode, String name, double price) {
        super(itemCode, name, price);
    }
}
