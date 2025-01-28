package gakvetili31davaleba;

public class Car {
    String company;
    String model;
    int year;
    int mileage;
    Engine engine;

    public Car(String company, String model, int year, int mileage, Engine engine) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.engine = engine;
    }
}
