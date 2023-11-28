package q20;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Bill", 25));
        students.add(new Student("Bill", 25));
        students.add(new Student("Bill", 26));

        System.out.println(students.size());
    }
    // override hashCode in Student class:
    // public int hashCode() {
    //     return Objects.hash(name, age);
    // }, or
    // record Student(String name, int age) {}
    //A record class provides the implementations of
    // equals(Object), hashCode(int) and toString() methods
    // based on the components of the record definition.
}
