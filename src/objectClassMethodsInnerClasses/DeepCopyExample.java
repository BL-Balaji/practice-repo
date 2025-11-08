package objectClassMethodsInnerClasses;
class Address{
    String city;

    public Address(String city) {
        this.city = city;
    }
}
class Employee implements Cloneable{
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone(); //shallow copy first
        cloned.address  = new Address(address.city);
        return cloned;

    }
}
public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address1 = new Address("Pune");
        Employee e1 = new Employee(1,"Rahul",address1);
        Employee e2 = (Employee) e1.clone();   // deep copy
        e2.address.city = "Nagpur";
        System.out.println("Original Employee City: " + e1.address.city);
        System.out.println("Cloned Employee City: " + e2.address.city);
    }
}
