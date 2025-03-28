package com.bridgelabz.mealplanner;

// Main class to maintain meal plan generator using generics
public class MealSystem {
    public static void main(String[] args) {
        // Create objects of meal with different meal types
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());

        // Create an object of MealPlanner to add different types of meal into planner
        MealPlanner planner = new MealPlanner();
        planner.addMealPlan(vegMeal);
        planner.addMealPlan(veganMeal);
        planner.addMealPlan(ketoMeal);
        planner.addMealPlan(highProteinMeal);

        // Display meal types details
        System.out.println("--- Personalized Meal Plans ---");
        planner.displayMealPlans();
    }
}
// Sample output ->
//--- Personalized Meal Plans ---
//Vegetarian Meal: Rich in vegetables, grains, and legumes.
//Vegan Meal: No animal products, includes plant-based proteins.
//Keto Meal: Low carb, high fat, moderate protein.
//High-Protein Meal: Focus on lean meats, eggs, and legumes.