package com.bridgelabz.warehousemanagement;

// Main class to maintain warehouse management using generics
public class WarehouseSystem {
    public static void main(String[] args) {
        // Create objects of Electronics, Groceries, and Furniture
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("11AA", "Laptop", 45000.0));
        electronicsStorage.addItem(new Electronics("12AC", "Smartphone", 25500.0));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("FR21", "Apples", 200.0));
        groceriesStorage.addItem(new Groceries("DP33", "Milk", 72.0));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("TB74", "Table", 150.0));
        furnitureStorage.addItem(new Furniture("CH45", "Chair", 225.0));

        // display item details
        System.out.println("--- Electronics ---");
        WarehouseUtility.displayItems(electronicsStorage.getItems());

        System.out.println("\n--- Groceries ---");
        WarehouseUtility.displayItems(groceriesStorage.getItems());

        System.out.println("\n--- Furniture ---");
        WarehouseUtility.displayItems(furnitureStorage.getItems());
    }
 
}
// Sample Output ->
// --- Electronics ---
// Item Code: 11AA| Item Name: Laptop| Price: 45000.0
// Item Code: 12AC| Item Name: Smartphone| Price: 25500.0

// --- Groceries ---
// Item Code: FR21| Item Name: Apples| Price: 200.0
// Item Code: DP33| Item Name: Milk| Price: 72.0

// --- Furniture ---
// Item Code: TB74| Item Name: Table| Price: 150.0
// Item Code: CH45| Item Name: Chair| Price: 225.0