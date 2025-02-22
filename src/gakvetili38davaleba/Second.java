package gakvetili38davaleba;

import java.util.*;

public class Second {
    public static void main(String[] args) {
        List <String> str = List.of("Baby", "Bomboclat", "Hello", "Java", "Brick");

        List <String> copystr = str.stream().filter(s -> s.startsWith("B")).toList();

        for (String s : copystr) {
            System.out.println(s);
        }
    }
}
