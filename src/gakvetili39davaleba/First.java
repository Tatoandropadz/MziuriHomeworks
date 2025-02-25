package gakvetili39davaleba;

import java.util.*;

public class First {
    public static void main(String[] args) {
        List <Worker> workers = Arrays.asList(
                new Worker("BOB", "bobcompany", 501),
                new Worker("Mark", "bobcompany", 250),
                new Worker("Marilyn", "MarilynCO", 750),
                new Worker("Charlie", "ChaplinFilms", 915),
                new Worker("MarksLongLostTwinBrother", "MarkIndustries", 1020),
                new Worker("BobsDad", "BobWeapons", 1500),
                new Worker("MarilynMom", "MarilynCO", 2000)
        );


        List <String> SortedWorkers = workers.stream().sorted((w1, w2) -> w2.pay.compareTo(w1.pay))
                .filter(w1 -> w1.pay>500).map(Worker::getName).limit(5).toList();


        for (String s : SortedWorkers){
            System.out.println(s);
        }
    }
}
