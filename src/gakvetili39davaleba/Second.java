package gakvetili39davaleba;

import java.util.*;

public class Second {
    public static void main(String[] args) {
        List <Integer> nums = List.of(1, 10, 5, 8, 11, 12, -6, 0);

        Integer max1 = nums.stream().filter(n -> n%2==0).map(n -> n*3).skip(2).max(Integer :: compare).get();

        System.out.println(max1);
    }
}
