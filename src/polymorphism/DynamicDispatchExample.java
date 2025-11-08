package polymorphism;

class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    @Override
    public void run() {
        System.out.println("Car is running safely");
    }
}

class Bike extends Vehicle {
    @Override
    public void run() {
        System.out.println("Bike is running fast");
    }
}

public class DynamicDispatchExample {
    public static void main(String[] args) {
        Vehicle v; // reference of parent

        v = new Car();  // upcasting
        v.run();        // Car's run() executes

        v = new Bike(); // upcasting
        v.run();        // Bike's run() executes
    }
}

