package constructors;

class StudentThis {
    String name;
    int age;

    // Constructor with parameters
    StudentThis(String name, int age) {
        this.name = name; // 'this' refers to instance variable
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        StudentThis s1 = new StudentThis("Shubham", 22);
        StudentThis s2 = new StudentThis("Balaji", 23);

        s1.display();
        s2.display();
    }
}

