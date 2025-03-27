package com.bridgelabz.onlinemarketplace;

import java.util.ArrayList;

// Class to add, remove and display products
class ProductCatalog {
    // Attributes
    private ArrayList<Product<?>> products = new ArrayList<>();

    // method to add product
    public void addProduct(Product<?> product) {
        products.add(product);
    }

    // method to remove product
    public void removeProduct(String itemCode) {
        boolean found = false;
        for(Product<?> product:products) {
            if(product.getItemCode().equalsIgnoreCase(itemCode)) {
                System.out.println("Removed Product details: ");
                product.displayProductDetails();
                products.remove(product);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Product with code: " + itemCode + " not found.");
        }
    }

    // method to display all products
    public void displayProducts() {
        for(Product<?> product:products) {
            product.displayProductDetails();
        }
    }
}
