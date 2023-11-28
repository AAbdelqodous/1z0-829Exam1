package q20;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }

    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            return this.name.equals(stud.name) &&
                    this.age == stud.age;
        }
        return false;
    }

    /* public int hashCode() {
        return Objects.hash(name, age);
    } */
}
