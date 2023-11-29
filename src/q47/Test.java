package q47;

public class Test {
    public static void main(String[] args) {
//        Operator operator = (i, j) -> System.out.println(i + j);
        Operator operator = Calculator::add;
        operator.operate(15, 25);

        /* Operator opr = (15, 25) -> Calculator.add(15, 25);
        ✗  Compilation error, literals and constants are not allowed as lambda parameters. */

        /* Operator opr = Calculator::add(i, j);
        ✗  Compilation error, when method reference syntax is used, then method parameters and not used.*/
    }
}
