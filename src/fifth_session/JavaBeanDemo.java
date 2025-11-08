package fifth_session;

class Student {
    private String name;  // private field

    // Default constructor
    public Student() {}

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

public class JavaBeanDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Balaji");
//        System.out.println(s.name);// using setter
        System.out.println("Student Name: " + s.getName()); // using getter
    }
}

