package q18;

import java.io.IOException;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) throws IOException {
        var console = System.console();
        console.writer().printf(
                "Enter a number between 1 and 7: "); //Line n1
        var num = Integer.parseInt(
                "" + (char)console.reader().read()); //Line n2
        var flag = IntStream.rangeClosed(1, 7)
                .anyMatch(i -> i == num);
        if (flag)
            console.printf("*".repeat(num));
        else
            console.writer().format("INVALID");
    }
}
