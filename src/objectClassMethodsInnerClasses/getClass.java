package objectClassMethodsInnerClasses;

class getClass{
    public static void main(String[] args) {
        getClass g1 = new getClass();
        Class<? extends getClass> aClass = g1.getClass();
        System.out.println(aClass.getName());

    }
}