package Abstraction;

// Parent interface 1
interface A {
    void display();
}

// Parent interface 2
interface B {
    void display();
}

// Class implementing both interfaces
class C implements A, B {
    // Must override the common method
    public void display() {
        System.out.println("Display method implementation from class C");
    }
}

// Main class
public class DiamondProblemExample {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}

