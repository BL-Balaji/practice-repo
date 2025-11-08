package polymorphism;

class Printer {
    // Print integer
    public void print(int num) {
        System.out.println("Printing Integer: " + num);
    }

    // Print double
    public void print(double num) {
        System.out.println("Printing Double: " + num);
    }

    // Print string
    public void print(String text) {
        System.out.println("Printing String: " + text);
    }

    // Print boolean
    public void print(boolean flag) {
        System.out.println("Printing Boolean: " + flag);
    }
}

public class PrinterExample {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(100);          // Integer
        p.print(99.99);        // Double
        p.print("Hello World");// String
        p.print(true);         // Boolean
    }
}

