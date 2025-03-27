package com.bridgelabz.onlinemarketplace;

// Main class to maintain marketplace using generics
class OnlineMarketplace {
    public static void main(String[] args) {
        // Create objects of Product class with different categories
        Product<BookCategory> book = new Product<>("AL11", "The Alchemist", 350.0, BookCategory.FICTION);
        Product<ClothingCategory> cloth = new Product<>("TS21", "T-Shirt", 250.0, ClothingCategory.MEN);
        Product<GadgetCategory> gadget = new Product<>("SM44", "Smartphone", 25000.0, GadgetCategory.MOBILE);

        // Create an object of ProductCatalog
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(cloth);
        catalog.addProduct(gadget);

        // display products before discount
        System.out.println("--- Product Catalog Before Discount ---");
        catalog.displayProducts();

        System.out.println("\nApplying Discount...");
        DiscountUtility.applyDiscount(book, 10);
        DiscountUtility.applyDiscount(cloth, 15);
        DiscountUtility.applyDiscount(gadget, 5);

        System.out.println("\n--- Product Catalog After Discount ---");
        catalog.displayProducts();
    }
}
// Sample Output ->
// --- Product Catalog Before Discount ---
// Product Code: AL11| Name: The Alchemist| Price: Rs.350.0| Category: FICTION
// Product Code: TS21| Name: T-Shirt| Price: Rs.250.0| Category: MEN
// Product Code: SM44| Name: Smartphone| Price: Rs.25000.0| Category: MOBILE

// Applying Discount...
// Discount applied: com.bridgelabz.onlinemarketplace.Product@31befd9f
// Discount applied: com.bridgelabz.onlinemarketplace.Product@1c20c684
// Discount applied: com.bridgelabz.onlinemarketplace.Product@1fb3ebeb

// --- Product Catalog After Discount ---
// Product Code: AL11| Name: The Alchemist| Price: Rs.315.0| Category: FICTION
// Product Code: TS21| Name: T-Shirt| Price: Rs.212.5| Category: MEN
// Product Code: SM44| Name: Smartphone| Price: Rs.23750.0| Category: MOBILE