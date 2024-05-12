package CafeManagementSystem_2;

import java.util.HashSet;
import java.util.Set;

public class IngredientSet {
    public static void main(String[] args) {
        // Create a set to store ingredient types
        Set<String> ingredientTypes = new HashSet<>();

        // Add some ingredient types
        ingredientTypes.add("Coffee beans");
        ingredientTypes.add("Milk");
        ingredientTypes.add("Sugar");
        ingredientTypes.add("Chocolate syrup");
        ingredientTypes.add("Vanilla extract");

        // Add a duplicate ingredient type (this will not be added to the set)
        ingredientTypes.add("Milk");

        // Display all ingredient types
        System.out.println("Ingredient Types:");
        for (String ingredient : ingredientTypes) {
            System.out.println(ingredient);
        }

        // Check if a specific ingredient type exists in the set
        String searchIngredient = "Sugar";
        if (ingredientTypes.contains(searchIngredient)) {
            System.out.println("\n" + searchIngredient + " is available.");
        } else {
            System.out.println("\n" + searchIngredient + " is not available.");
        }
    }
}