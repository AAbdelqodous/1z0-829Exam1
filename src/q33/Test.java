package q33;

import java.util.function.BiFunction;

public class Test {
    public static void main(String[] args) {
        BiFunction<Double, Double, Integer> compFunc =
                Double::compareTo; //BiFunction<T, U, R> : R apply(T t, U u);
        System.out.println(compFunc.apply(10.01, 11.99));
    }
}
