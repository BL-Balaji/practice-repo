package fifth_session;

final class Person {
    private final String name;  // final field

    public Person(String name) { // value set only once
        this.name = name;
    }

    public String getName() {
        return name; // no setter provided
    }
}

public class ImmutableDemo {
    public static void main(String[] args) {
        Person p = new Person("Balaji");
        System.out.println("Person: " + p.getName());

        // ❌ Not allowed (no setter method)
        // p.name = "Alice";
    }
}

