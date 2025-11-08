package constructors;

class Animal {
}

class Dog extends Animal {
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        // Check instances
        System.out.println(a instanceof Animal);
        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Animal);
        System.out.println(a instanceof Dog);
    }
}

