package com.bridgelabz.mealplanner;

// Interface to be implemented to define different types of meal plans
interface MealPlan {
    String getMealDetails();
}

// Subclass -> VegetarianMeal
class VegetarianMeal implements MealPlan {
    public String getMealDetails() {
        return "Vegetarian Meal: Rich in vegetables, grains, and legumes.";
    }
}

// Subclass -> VeganMeal
class VeganMeal implements MealPlan {
    public String getMealDetails() {
        return "Vegan Meal: No animal products, includes plant-based proteins.";
    }
}

// Subclass -> KetoMeal
class KetoMeal implements MealPlan {
    public String getMealDetails() {
        return "Keto Meal: Low carb, high fat, moderate protein.";
    }
}

// Subclass -> HighProteinMeal
class HighProteinMeal implements MealPlan {
    public String getMealDetails() {
        return "High-Protein Meal: Focus on lean meats, eggs, and legumes.";
    }
}