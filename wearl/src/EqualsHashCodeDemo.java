import java.util.Objects;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // same reference
        if (o == null || getClass() != o.getClass()) return false;
        Employee emp = (Employee) o;
        return id == emp.id && Objects.equals(name, emp.name);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class EqualsHashCodeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Saurabh");
        Employee e2 = new Employee(101, "Saurabh");
        Employee e3 = e1;

        System.out.println(e1 == e2);      // false → different objects
        System.out.println(e1 == e3);      // true → same reference
        System.out.println(e1.equals(e2)); // true → same data
    }
}
