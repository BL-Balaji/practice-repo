package uml_diagram;

class Order {
    int orderId;
    String productName;
    void confirmOrder() {
        System.out.println("Order confirmed for product: " + productName);
    }
}
