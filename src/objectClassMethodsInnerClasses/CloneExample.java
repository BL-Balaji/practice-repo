package objectClassMethodsInnerClasses;
class City{
    String city;

    public City(String city) {
        this.city = city;
    }
}
class Student implements Cloneable{
    int id;
    String name;
    City city;

    public Student(int id, String name, City city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // creates shallow copy
    }
}
public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        City city = new City("Pune");
        Student s1 = new Student(1,"Rajesh", city);
        Student s2 = (Student) s1.clone();
        s2.city.city = "Mumbai";
        s2.name = "Shubham";
        s2.id = 2;
        System.out.println("Original Object: " + s1.id + " " + s1.name+" "+s1.city.city);
        System.out.println("Cloned Object: " + s2.id + " " + s2.name+" "+s2 .city.city);
    }
}
