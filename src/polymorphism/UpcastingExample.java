package polymorphism;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog is fetching the ball!");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        // Upcasting: Dog object is referred by Animal reference
        Animal a = new Dog();

        a.sound(); // Allowed (method overridden in Dog class)
//      a.fetch(); // Not allowed (child-specific method)
    }
}

