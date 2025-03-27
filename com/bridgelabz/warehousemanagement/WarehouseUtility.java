package com.bridgelabz.warehousemanagement;

import java.util.ArrayList;

// Utility class to display items using wildcards
class WarehouseUtility {
    // method to display all items in storage
    public static void displayItems(ArrayList<? extends WarehouseItem> items) {
        for(WarehouseItem item:items) {
            item.displayItemDetails();
        }
    }
}
