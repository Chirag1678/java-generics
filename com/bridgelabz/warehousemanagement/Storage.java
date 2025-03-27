package com.bridgelabz.warehousemanagement;

import java.util.ArrayList;

// Generic class to store item with bounded types
class Storage<T extends WarehouseItem> {
    // Attributes
    private final ArrayList<T> items = new ArrayList<>();

    // method to add item to storage
    public void addItem(T item) {
        items.add(item);
    }

    // method to remove item from storage
    public void removeItem(String itemCode) {
        boolean found = false;
        for(T item:items) {
            if(item.getItemCode().equalsIgnoreCase(itemCode)) {
                System.out.println("Removed item details: ");
                item.displayItemDetails();
                items.remove(item);
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Item with code: " + itemCode + " not found.");
    }

    // method to retrieve item from storage
    public void retrieveItem(String itemCode) {
        boolean found = false;
        for(T item:items) {
            if(item.getItemCode().equalsIgnoreCase(itemCode)) {
                System.out.println("Item found, details: ");
                item.displayItemDetails();
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Item with code: " + itemCode + " not found.");
    }

    // method to return a list of items
    public ArrayList<T> getItems() {
        return items;
    }
}
