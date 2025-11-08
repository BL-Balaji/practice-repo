package objectClassMethodsInnerClasses;

interface Message {
    void printMessage();
}

class AnonymousInnerClassExample {
    public static void main(String[] args) {
        Message msg = new Message() {
            @Override
            public void printMessage() {
                System.out.println("Hello from Anonymous Inner Class");
            }
        };

        msg.printMessage();
    }
}

