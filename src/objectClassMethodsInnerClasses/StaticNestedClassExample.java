package objectClassMethodsInnerClasses;

class StaticNestedClassExample {
    static String greeting = "Hi from Static Nested Class";

    static class Nested {
        void show() {
            System.out.println(greeting);
        }
    }

    public static void main(String[] args) {
        StaticNestedClassExample.Nested nested = new StaticNestedClassExample.Nested();
        nested.show();
    }
}

