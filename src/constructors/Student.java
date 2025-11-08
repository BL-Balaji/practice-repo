package constructors;

public class Student {
    private String name;
    private int age;
    // Constructor - same name as class, no return type
    public Student() {
        System.out.println("Student object created!");
    }

    // parameterized constructor
    public Student(String name, int age)
    {
        this.age = age;
        this.name = name;
    }


    public static void main(String[] args)
    {
        Student student = new Student();
        int age1 = student.age;
        System.out.println(age1);

        Student student1 = new Student("Balaji", 24);
        System.out.println(student1.age);

    }
}
