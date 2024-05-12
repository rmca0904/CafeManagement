import java.util.Stack;

// Define a class to represent an action
class Action {
    private String description;

    public Action(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

// CafeManager class with undo functionality
class CafeManager {
    private Stack<Action> actionStack;

    public CafeManager() {
        actionStack = new Stack<>();
    }

    // Method to perform an action
    public void performAction(String actionDescription) {
        Action action = new Action(actionDescription);
        actionStack.push(action);
        System.out.println("Performed action: " + actionDescription);
    }

    // Method to undo the last action
    public void undoLastAction() {
        if (!actionStack.isEmpty()) {
            Action lastAction = actionStack.pop();
            System.out.println("Undoing action: " + lastAction.getDescription());
        } else {
            System.out.println("No actions to undo.");
        }
    }
}


