package com.bridgelabz.mealplanner;

import java.util.ArrayList;

// Class to maintain, add or remove meal plans using generic method
class MealPlanner {
    private ArrayList<Meal<? extends MealPlan>> meals = new ArrayList<>();

    // method to add meal plan
    public void addMealPlan(Meal<? extends MealPlan> meal) {
        meals.add(meal);
    }

    // method to display meal plans
    public void displayMealPlans() {
        for(Meal<? extends MealPlan> meal:meals) {
            meal.displayMealDetails();
        }
    }
}
