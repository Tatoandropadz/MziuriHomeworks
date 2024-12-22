package gakvetili25hw;
import java.io.*;


public class pirveli {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Tato", "0", 10);
        Student s2 = new Student("Ana", "1", 9);
        Student s3 = new Student("Mari", "2", 11);
        Student s4 = new Student("Giorgi", "3", 12);
        Student s5 = new Student("Nika", "4", 14);


        FileOutputStream fileOutputStream = new FileOutputStream("out.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(s1);
        objectOutputStream.writeObject(s2);
        objectOutputStream.writeObject(s3);
        objectOutputStream.writeObject(s4);
        objectOutputStream.writeObject(s5);

        objectOutputStream.close();
        fileOutputStream.close();
    }


}


class Student implements Serializable {
    String name;
    String id;
    int grade;

    public Student(String name, String id, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = id;
    }
}