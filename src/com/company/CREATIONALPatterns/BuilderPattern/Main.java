package com.company.CREATIONALPatterns.BuilderPattern;

public class Main {
    public static void main(String[] args) {


        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg meal");
        vegMeal.showItems();
        System.out.println("Total cost: " +vegMeal.getCost());

        Meal nonvegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("non veg meal");
        nonvegMeal.showItems();
        System.out.println("Total cost: " +nonvegMeal.getCost());
    }
}
