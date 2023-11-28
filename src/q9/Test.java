package q9;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var stud = new Student( "Aamir", 25, "Computer Science");
        try (var oos = new ObjectOutputStream( new FileOutputStream(("C:\\Users\\ahmed.elsayed\\Documents\\java\\stud.ser")));
             var ois = new ObjectInputStream( new FileInputStream("C:\\Users\\ahmed.elsayed\\Documents\\java\\stud.ser")))
        {
            oos.writeObject(stud);
            var s = (Student) ois.readObject();
            System.out.printf("%s, %d, %s", s.getName(), s.getAge(), s.getCourse());
        }
    }
}
