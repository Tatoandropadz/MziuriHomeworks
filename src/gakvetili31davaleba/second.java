package gakvetili31davaleba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class second {
    public static void main(String[] args) {
        Date date1 = new Date(1999, 2, 10);
        Date date2 = new Date(2000, 8, 11);
        Date date3 = new Date(1999, 1, 1);

        ArrayList <Integer> grades1 = new ArrayList<>();
        grades1.add(10);
        grades1.add(9);
        grades1.add(5);

        ArrayList <Integer> grades2 = new ArrayList<>();
        grades2.add(10);
        grades2.add(10);
        grades2.add(10);

        ArrayList <Integer> grades3 = new ArrayList<>();
        grades3.add(8);
        grades3.add(9);
        grades3.add(10);


        Student s1 = new Student("David", "Davidson", date1, grades1);
        Student s2 = new Student("Luke", "Nichols", date2, grades2);
        Student s3 = new Student("Jumber", "moirwyashvili", date3, grades3);

        ArrayList <Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("Daulageblad:");
        print(students);
        System.out.println();
        System.out.println();


        System.out.println("Leqsikografiulad:");
        for (int i = 0; i < students.size(); i++) {
            for (int j = i+1; j < students.size(); j++) {
                if (students.get(i).name.compareTo(students.get(j).name) > 0) {
                    Collections.swap(students, i, j);
                }

                else if (students.get(i).name.compareTo(students.get(j).name) == 0) {
                    if (students.get(i).surname.compareTo(students.get(j).surname) > 0) {
                        Collections.swap(students, i, j);
                    }
                }
            }
        }
        print(students);
        System.out.println();
        System.out.println();

        System.out.println("Sashualo qulit:");
        for (int i = 0; i < students.size(); i++) {
            for (int j = i+1; j < students.size(); j++) {
                if (students.get(i).avg() < students.get(j).avg()) {
                    Collections.swap(students, i, j);
                }
            }
        }
        print(students);
        System.out.println();
        System.out.println();


        System.out.println("dabadebis wlit:");
        for (int i = 0; i < students.size(); i++) {
            for (int j = i+1; j < students.size(); j++) {
                if (students.get(i).date.before(students.get(j).date)) {
                    Collections.swap(students, i, j);
                }
            }
        }
        print(students);
    }


    public static void print(ArrayList <Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).name + " " + students.get(i).surname);
        }
    }
}
