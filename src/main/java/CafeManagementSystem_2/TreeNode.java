package CafeManagementSystem_2;
class TreeNode {
    private Customer customer;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Customer customer) {
        this.customer = customer;
        this.leftChild = null;
        this.rightChild = null;
    }

    public Customer getCustomer() {
        return customer;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
