package gakvetili39davaleba;


public class Worker{
    String name;
    String depName;
    Integer pay;

    public Worker(String name, String depName, int pay) {
        this.name = name;
        this.depName = depName;
        this.pay = pay;
    }

    String getName() {
        return name;
    }
}


