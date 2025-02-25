package gakvetili39davaleba;

public class Student {
    String name;
    Integer grade;

    public Student(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
