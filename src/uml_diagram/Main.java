package uml_diagram;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.customerId = 101;
        c1.name = "Rahul";

        Order o1 = new Order();
        o1.orderId = 5001;
        o1.productName = "Laptop";

        c1.placeOrder(o1);
    }
}

