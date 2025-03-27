package com.bridgelabz.onlinemarketplace;

// Enum categories for different product types
enum BookCategory {FICTION, NON_FICTION, EDUCATIONAL}
enum ClothingCategory {MEN, WOMEN, KIDS}
enum GadgetCategory {MOBILE, LAPTOP, ACCESSORY}

// Generic class to define a product
class Product<T> {
    // Attributes
    private String itemCode;
    private String name;
    private double price;
    private T category;

    // Constructor
    Product(String itemCode, String name, double price, T category) {
        this.itemCode = itemCode;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // getter method for item code
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

    // getter method for category
    public T getCategory() {
        return category;
    }

    // setter method for price
    public void setPrice(double price) {
        this.price = price;
    }

    // method to display product details
    public void displayProductDetails() {
        System.out.println("Product Code: " + itemCode + "| Name: " + name + "| Price: Rs." + price + "| Category: " + category);
    }

}
