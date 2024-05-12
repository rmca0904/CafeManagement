package CafeManagementSystem_2;

class CustomerBST {
    private TreeNode root;

    public CustomerBST() {
        this.root = null;
    }

    // Method to insert a new customer into the BST
    public void insert(Customer customer) {
        root = insertRecursive(root, customer);
    }

    private TreeNode insertRecursive(TreeNode root, Customer customer) {
        if (root == null) {
            return new TreeNode(customer);
        }

        if (customer.getId() < root.getCustomer().getId()) {
            root.setLeftChild(insertRecursive(root.getLeftChild(), customer));
        } else if (customer.getId() > root.getCustomer().getId()) {
            root.setRightChild(insertRecursive(root.getRightChild(), customer));
        }

        return root;
    }

    // Method to search for a customer by ID
    public Customer search(int customerId) {
        TreeNode result = searchRecursive(root, customerId);
        return (result != null) ? result.getCustomer() : null;
    }

    private TreeNode searchRecursive(TreeNode root, int customerId) {
        if (root == null || root.getCustomer().getId() == customerId) {
            return root;
        }

        if (customerId < root.getCustomer().getId()) {
            return searchRecursive(root.getLeftChild(), customerId);
        } else {
            return searchRecursive(root.getRightChild(), customerId);
        }
    }
}
