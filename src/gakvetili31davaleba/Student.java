package gakvetili31davaleba;

import java.util.ArrayList;
import java.util.Date;

public class Student {
    String name;
    String surname;
    Date date;
    ArrayList <Integer> grades = new ArrayList<>();

    public Student(String name, String surname, Date date, ArrayList<Integer> grades) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.grades = grades;
    }

    public double avg() {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }

        return (double)sum / grades.size();
    }

}
