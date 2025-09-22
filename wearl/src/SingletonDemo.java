class Singleton {
    private static Singleton instance;

    // Private constructor → direct object creation prevent
    private Singleton() {}

    // Public static method → return same instance always
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // first time object banega
        }
        return instance; // baad me wahi object return hoga
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); // true → same object
    }
}
