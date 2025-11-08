package polymorphism;

class Vehicles {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Cars extends Vehicles {
    public void openRoof() {
        System.out.println("Car's sunroof is opened!");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        // Upcasting: Car object is referred by Vehicle reference
        Vehicles v = new Cars();
        v.start();

        // Downcasting: Vehicle → Car
        Cars c = (Cars) v;
        c.start();       // Parent method
        c.openRoof();    // Child-specific method
    }
}

