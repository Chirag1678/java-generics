package com.bridgelabz.mealplanner;

// Generic class to handle different meal plans
class Meal<T extends MealPlan> {
    // Attribute
    private T mealType;

    // Constructor
    Meal(T mealType) {
        this.mealType = mealType;
    }

    // getter method for meal type
    public T getMealType() {
        return mealType;
    }

    // method to display meal details
    public void displayMealDetails() {
        System.out.println(mealType.getMealDetails());
    }
}
