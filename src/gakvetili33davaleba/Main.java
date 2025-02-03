package gakvetili33davaleba;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class SortByPay implements Comparator <Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (-1)*o1.pay.compareTo(o2.pay);
    }
}

public class Main {
    public static void main(String[] args) {
        List <Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tato", 300));
        employees.add(new Employee("Giorgi", 250));
        employees.add(new Employee("Nino", 400));
        employees.add(new Employee("Mariami", 350));

        System.out.println("Comparable:");
        SortByPayComparable(employees);
        print(employees);


        System.out.println("Comparator:");
        SortByPayComparator(employees);
        print(employees);


        System.out.println("Min:");
        System.out.println(Collections.min(employees));

        System.out.println("Max:");
        System.out.println(Collections.max(employees));


        System.out.println("Reverse:");
        Collections.reverse(employees);
        print(employees);


    }

    static void SortByPayComparator (List <Employee> employees) {
        Collections.sort(employees, new SortByPay());
    }

    static void SortByPayComparable (List <Employee> employees) {
        Collections.sort(employees);
    }

    static void print(List <Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).name + " " + employees.get(i).pay);
        }
    }
}
