package q13;

import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        var path1 = Paths.get("F:", "Other", "Logs");
        var path2 = Paths.get("..", "..", "Shortcut",
                "Child.lnk", "Message.txt");

        var path3 = path1.resolve(path2).normalize(); //[F:\Other\Logs\..\..\Shortcut\Child.lnk\Message.txt].
        var path4 = path1.resolveSibling(path2).normalize(); //  [F:\Other\..\..\Shortcut\Child.lnk\Message.txt].

        System.out.println(path3.equals(path4));
    }
}
