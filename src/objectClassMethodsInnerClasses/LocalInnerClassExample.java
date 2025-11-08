package objectClassMethodsInnerClasses;

class LocalInnerClassExample {
    void outerMethod() {
        class LocalInner {
            void show() {
                System.out.println("Inside Local Inner Class");
            }
        }

        LocalInner obj = new LocalInner();
        obj.show();
    }

    public static void main(String[] args) {
        LocalInnerClassExample outer = new LocalInnerClassExample();
        outer.outerMethod();
    }
}

