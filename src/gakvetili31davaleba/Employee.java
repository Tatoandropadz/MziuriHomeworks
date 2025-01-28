package gakvetili31davaleba;

public class Employee{
    String name;
    String surname;
    String id;
    int pay;

    public Employee(String name, String surname, String id, int pay) throws IdException{
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.pay = pay;


        if(id.length() != 11) {
            throw new IdException("Incorrect ID!");
        }

        for (int i = 0; i < id.length(); i++) {
            if(id.charAt(i) < 48 || id.charAt(i) > 57) {
                throw new IdException("Incorrect ID!");
            }
        }
    }

}

