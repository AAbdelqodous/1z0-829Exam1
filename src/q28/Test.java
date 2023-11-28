package q28;

public class Test {
    public static void main(String[] args) {
        Base base = new Derived(); //Line n9
        // Base() method defined in Derived class is executed.
        // Which overriding method to invoke, is decided at runtime based on the instance.
    }
}
