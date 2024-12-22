package gakvetili25hw;
import java.io.*;


public class meore {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("out.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student[] a = new Student[5];

        for (int i = 0; i < 5; i++) {
            a[i] = (Student) objectInputStream.readObject();
        }

        fileInputStream.close();
        objectInputStream.close();

        int maxIndex = 0;
        for (int i = 0; i < 5; i++) {
            if (a[maxIndex].grade < a[i].grade) {
                maxIndex = i;
            }
        }

        System.out.println(a[maxIndex].name);
    }
}


