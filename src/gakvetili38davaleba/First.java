package gakvetili38davaleba;

import java.util.*;


public class First {
    public static void main(String[] args) {

        List <Integer> nums = List.of(1, 2, 3);

        int sum = nums.stream().reduce(0, (n1, n2) -> n1 + n2*n2);


        System.out.println(sum);
    }
}
