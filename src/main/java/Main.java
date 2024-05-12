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
    }
}