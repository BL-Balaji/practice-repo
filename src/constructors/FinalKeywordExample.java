package constructors;

// 1. final variable example
class StudentFinalKeyWord {
    final String COLLEGE_NAME = "ABC College"; // constant

    String name;
    int age;

    StudentFinalKeyWord(String name, int age) {
        this.name = name;
        this.age = age;
        // COLLEGE_NAME = "XYZ";  //  Not allowed, final variable cannot be changed
    }

    // 2. final method example
    final void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", College: " + COLLEGE_NAME);
    }
}

// 3. final class example
final class Teacher {
    void show() {
        System.out.println("This is a final class, cannot be inherited.");
    }
}

// Not allowed: Cannot extend a final class
//  NewTeacher extends Teacher {}

public class FinalKeywordExample {
    public static void main(String[] args) {
        StudentFinalKeyWord s1 = new StudentFinalKeyWord("Shubham", 22);
        s1.displayInfo();

        Teacher t1 = new Teacher();
        t1.show();
    }
}

