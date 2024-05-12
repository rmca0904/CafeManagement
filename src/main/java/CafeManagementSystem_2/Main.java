package CafeManagementSystem_2;

public class Main {
    public static void main(String[] args) {
        CafeManager cafeManager = new CafeManager();

        // Perform some actions
        cafeManager.performAction("Add new menu item");
        cafeManager.performAction("Update employee schedule");
        cafeManager.performAction("Generate sales report");

        // Undo the last action
        cafeManager.undoLastAction();

        // Perform another action
        cafeManager.performAction("Edit customer reservation");

        // Undo again
        cafeManager.undoLastAction();
        cafeManager.undoLastAction(); // Trying to undo more actions than performed

        // Create a CafeManager instance
        CafeManagementSystem cafeManagementSystem = new CafeManagementSystem();

        // Add customers
        cafeManagementSystem.addCustomer(101, "Alice");
        cafeManagementSystem.addCustomer(102, "Bob");
        cafeManagementSystem.addCustomer(103, "Charlie");

        // Find a customer
        cafeManagementSystem.findCustomer(102);
    }
}