package gakvetili31davaleba;

import java.util.ArrayList;
import java.util.Collections;

public class first {
    public static void main(String[] args) {
        ArrayList <Basketballer> basketballers = new ArrayList<>();

        Basketballer a1 = new Basketballer("a1", "a11", 1, 1,1 , 1, 1);
        Basketballer a2 = new Basketballer("a2", "a22", 1, 2, 5, 3, 2);
        Basketballer a3 = new Basketballer("a3", "a33", 5, 2, 3, 4, 3);

        basketballers.add(a1);
        basketballers.add(a2);
        basketballers.add(a3);


        System.out.println("klebadobit:");

        for (int i = 0; i < basketballers.size()-1; i++) {
            for (int j = i+1; j < basketballers.size(); j++) {
                if (basketballers.get(i).qula() < basketballers.get(j).qula()) {
                    Collections.swap(basketballers, i, j);
                }
            }
        }

        for(int i = 0; i < basketballers.size(); i++) {
            System.out.println(basketballers.get(i).name +" "+ basketballers.get(i).surname + " " + basketballers.get(i).qula());
        }


        System.out.println("zrdadobit:");

        for (int i = 0; i < basketballers.size()-1; i++) {
            for (int j = i+1; j < basketballers.size(); j++) {
                if (basketballers.get(i).qula() > basketballers.get(j).qula()) {
                    Collections.swap(basketballers, i, j);
                }
            }
        }

        for(int i = 0; i < basketballers.size(); i++) {
            System.out.println(basketballers.get(i).name +" "+ basketballers.get(i).surname + " " + basketballers.get(i).qula());
        }
    }
}
