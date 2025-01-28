package gakvetili31davaleba;

import java.util.ArrayList;
import java.util.HashMap;

public class fourth {
    public static void main(String[] args) throws IdException{


        Employee employee1 = new Employee("David", "Davidson", "00000000001", 400);
        Employee employee2 = new Employee("Steve", "Steveson", "00000000002", 750);
        ArrayList <Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);


        Adress adress = new Adress("Georgia", "Tbilisi", "Kostava", 41);


        HashMap <String, String> contact = new HashMap<>();
        contact.put("Center", "572283912");
        contact.put("Help Desk", "523981881");
        contact.put("CEO", "541908844");

        Corporation corporation = new Corporation("BlackRock", adress, contact, employees);


        corporation.aboutUs();
        System.out.println(corporation.totalPay());
    }
}
