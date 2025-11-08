package Abstraction;

// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Non-abstract method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

// Main class
public class AbstractClassExample {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound();  // Bark
        a.sleep();  // Sleeping...
    }
}

