package q40;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        var ropes = Stream.of(
                new Rope(100, Color.RED),
                new Rope(200, Color.BLUE),
                new Rope(200, Color.RED),
                new Rope(300, Color.RED),
                new Rope(100, Color.BLUE));

        var result = ropes.collect(
                Collectors.teeing(
                        Collectors.groupingBy(Rope::color),  // Collector<Rope, ?, Map<Color, List<Rope>>> downstream1 = Collectors.groupingBy(Rope::color);
                        Collectors.groupingBy(Rope::length), // Collector<Rope, ?, Map<Integer, List<Rope>>> downstream2 = Collectors.groupingBy(Rope::length);
                        Group::new
                ));
        /*
        public static <T, R1, R2, R> Collector<T,?,R> teeing(
                                    Collector<? super T,?,R1> downstream1,
                                    Collector<? super T,?,R2> downstream2,
                                    BiFunction<? super R1,? super R2,R> merger){...}*/
//        T is of Rope type, R1 is of Map<Color, List<Rope>> type, R2 is of Map<Integer, List<Rope>> type, and R is of Group type.

        /* Result of downstream1 is:
        {
            BLUE=[Rope[length=200, color=BLUE], Rope[length=100, color=BLUE]],
            RED=[Rope[length=100, color=RED], Rope[length=200, color=RED], Rope[length=300, color=RED]]
        }: Map<Color, List<Rope>> type */

        /* Result of downstream2 is:
        {
            100=[Rope[length=100, color=RED], Rope[length=100, color=BLUE]],
            200=[Rope[length=200, color=BLUE], Rope[length=200, color=RED]],
            300=[Rope[length=300, color=RED]]
        }: Map<Integer, List<Rope>> type */


        System.out.println(result.map1().size() +
                result.map2().size());
    }
}
