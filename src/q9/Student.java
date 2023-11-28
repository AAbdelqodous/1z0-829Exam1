package q9;

import java.io.Serializable;

public class Student extends Person implements Serializable {
    private String course;
    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }
    public String getCourse() {
        return course;
    }
}
