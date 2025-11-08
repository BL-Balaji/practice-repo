package uml_diagram;

class Customer {
    int customerId;
    String name;

    void placeOrder(Order order) {
        System.out.println(name + " placed an order for " + order.productName);
    }
}
