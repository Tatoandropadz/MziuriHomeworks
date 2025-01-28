package gakvetili31davaleba;

import java.util.ArrayList;
import java.util.Collections;

public class third {
    public static void main(String[] args) {
        Engine engine1 = new Engine("regular", 6, 5);
        Engine engine2 = new Engine("diesel", 6, 10);

        Car car1 = new Car("BMW", "E46", 1998, 150000, engine1);
        Car car2 = new Car("Mini Cooper", "Sport", 2016, 35000, engine1);
        Car car3 = new Car("Ford", "Duty", 2006, 120000, engine2);

        ArrayList <Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println("Daulageblad:");
        print(cars);

        System.out.println("Dalagebuli wlis mixedvit:");
        for (int i = 0; i < cars.size(); i++) {
            for (int j = i+1; j < cars.size(); j++) {
                if (cars.get(i).year < cars.get(j).year) {
                    Collections.swap(cars, i, j);
                }
            }
        }
        print(cars);

        System.out.println("Dalagebuli garbenis mixedvit:");
        for (int i = 0; i < cars.size(); i++) {
            for (int j = i+1; j < cars.size(); j++) {
                if (cars.get(i).mileage > cars.get(j).mileage) {
                    Collections.swap(cars, i, j);
                }
            }
        }
        print(cars);


        System.out.println("dalagebuli dzravis moculobis mixedvit:");
        for (int i = 0; i < cars.size(); i++) {
            for (int j = i+1; j < cars.size(); j++) {
                if (cars.get(i).engine.volume < cars.get(j).engine.volume) {
                    Collections.swap(cars, i, j);
                }
            }
        }
        print(cars);

    }


    static void print (ArrayList <Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).company + " " + cars.get(i).model + " " + cars.get(i).year + " " +
                    cars.get(i).mileage + " " + cars.get(i).engine.fuelType + " " +
                    cars.get(i).engine.cylinders + " " + cars.get(i).engine.volume);
        }
    }
}
