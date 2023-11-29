package q51;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException {
//        var files = Files.list(Paths.get( System.getProperty("user.home")));
        var files = Files.walk(Paths.get( System.getProperty("user.home")));
        files.forEach(System.out::println);
    }
}
