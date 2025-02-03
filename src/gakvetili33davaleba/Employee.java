package gakvetili33davaleba;

public class Employee implements Comparable<Employee>{
    String name;
    Integer pay;

    public Employee(String name, int pay) {
        this.name = name;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", pay=" + pay +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return this.pay.compareTo(o.pay);
    }
}
