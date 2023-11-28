package q5;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        var festivals =
                List.of("DIWALI", "CHRISTMAS", "EID"); //Static List.of() overloaded methods were added in Java 9 and
        // these return an unmodifiable list containing passed elements.
        festivals.removeIf(str -> str.length() == 3);
        System.out.println(festivals);
    }
}
