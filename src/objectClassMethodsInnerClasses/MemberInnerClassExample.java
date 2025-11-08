package objectClassMethodsInnerClasses;

class MemberInnerClassExample {
    private String message = "Hello from Outer Class";

    class Inner {
        void display() {
            System.out.println(message); // Accessing outer class variable
        }
    }

    public static void main(String[] args) {
        MemberInnerClassExample outer = new MemberInnerClassExample();
        MemberInnerClassExample.Inner inner = outer.new Inner(); // Requires outer instance
        inner.display();
    }
}

