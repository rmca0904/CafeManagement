package CafeManagementSystem_2;
class Customer {
    private int id;
    private String name;
    // Additional customer data and methods can be added as needed

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
