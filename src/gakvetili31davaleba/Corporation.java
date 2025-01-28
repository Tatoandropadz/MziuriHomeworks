package gakvetili31davaleba;

import java.util.HashMap;
import java.util.ArrayList;

public class Corporation {
    String name;
    Adress adress;
    HashMap<String, String> contact = new HashMap<>();
    ArrayList <Employee> employees = new ArrayList<>();

    public Corporation(String name, Adress adress, HashMap<String,
            String> contact, ArrayList<Employee> employees) {
        this.name = name;
        this.adress = adress;
        this.contact = contact;
        this.employees = employees;
    }

    public void aboutUs() {
        System.out.println(contact);
    }


    public int totalPay() {
        int total = 0;
        for (int i = 0; i < employees.size(); i++) {
            total += employees.get(i).pay;
        }

        return total;
    }
}
