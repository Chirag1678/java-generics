package com.bridgelabz.onlinemarketplace;

// Utility class to calculate discount using generic method
class DiscountUtility {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmt = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmt);
        System.out.println("Discount applied: " + product);
    }
}
