package constructors;

class Students {
    String name;
    int age;
    String course;

    // Constructor 1: No parameters (default values)
    Students() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }

    // Constructor 2: Only name and age
    Students(String n, int a) {
        name = n;
        age = a;
        course = "Not Assigned";
    }

    // Constructor 3: All parameters
    Students(String n, int a, String c) {
        name = n;
        age = a;
        course = c;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        // Using different constructors
        Students s1 = new Students();  // calls Constructor 1
        Students s2 = new Students("Shubham", 22); // calls Constructor 2
        Students s3 = new Students("Balaji", 23, "Computer Science"); // calls Constructor 3

        s1.display();
        s2.display();
        s3.display();
    }
}
