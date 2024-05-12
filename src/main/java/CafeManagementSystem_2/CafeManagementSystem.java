
package CafeManagementSystem_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.HashMap;
import java.util.Map;


public class CafeManagementSystem extends Application {

    private double x = 0;
    private double y = 0;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        root.setOnMousePressed((MouseEvent event) ->{
            x = event.getSceneX();
            y = event.getSceneY();
        });

        root.setOnMouseDragged((MouseEvent event) ->{
            stage.setX(event.getScreenX() - x);
            stage.setY(event.getScreenY() - y);

            stage.setOpacity(.8f);
        });

        root.setOnMouseReleased((MouseEvent event) ->{
            stage.setOpacity(1);
        });

        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setScene(scene);
        stage.show();
    }

    private CustomerBST customerBST;

    public CafeManagementSystem() {
        customerBST = new CustomerBST();
    }

    // Method to add a new customer
    public void addCustomer(int id, String name) {
        Customer customer = new Customer(id, name);
        customerBST.insert(customer);
        System.out.println("Customer added: " + name);
    }

    // Method to search for a customer by ID
    public void findCustomer(int customerId) {
        Customer customer = customerBST.search(customerId);
        if (customer != null) {
            System.out.println("Customer found: " + customer.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }

    public void manageIngredients() {
        // Create a hash table to store ingredient types and quantities
        Map<String, Integer> ingredientTable = new HashMap<>();

        // Add some ingredient types with their quantities
        ingredientTable.put("Coffee beans", 1000); // 1000 grams
        ingredientTable.put("Milk", 2000); // 2000 milliliters
        ingredientTable.put("Sugar", 500); // 500 grams
        ingredientTable.put("Chocolate syrup", 300); // 300 milliliters
        ingredientTable.put("Vanilla extract", 100); // 100 milliliters

        // Add more of an ingredient (update quantity)
        ingredientTable.put("Milk", ingredientTable.getOrDefault("Milk", 0) + 500); // Add 500 milliliters of milk

        // Display all ingredient types and their quantities
        System.out.println("Ingredient Types and Quantities:");
        for (Map.Entry<String, Integer> entry : ingredientTable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if a specific ingredient type exists in the table
        String searchIngredient = "Sugar";
        if (ingredientTable.containsKey(searchIngredient)) {
            System.out.println("\n" + searchIngredient + " is available.");
        } else {
            System.out.println("\n" + searchIngredient + " is not available.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}