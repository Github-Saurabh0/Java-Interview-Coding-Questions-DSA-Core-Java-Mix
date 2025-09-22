import java.util.*;

final class Student {
    private final String name;
    private final int age;
    private final List<String> subjects;

    // Constructor
    public Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        // Defensive copy so original list modify na ho
        this.subjects = new ArrayList<>(subjects);
    }

    // Getters (no setters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Return copy of list (not original)
    public List<String> getSubjects() {
        return new ArrayList<>(subjects);
    }
}

public class ImmutableDemo {
    public static void main(String[] args) {
        List<String> subs = new ArrayList<>();
        subs.add("Maths");
        subs.add("Science");

        Student s1 = new Student("Saurabh", 24, subs);
        System.out.println(s1.getSubjects()); // [Maths, Science]

        // Trying to modify original list
        subs.add("English");
        System.out.println(s1.getSubjects()); // Still [Maths, Science]
    }
}
