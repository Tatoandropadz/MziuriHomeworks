package Saklaso1;

import java.util.ArrayList;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> ints = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int n = scanner.nextInt();
            ints.add(n);
        }

        for (int i = 0; i < ints.size(); i++) {
            for (int j = i+1; j < ints.size(); j++) {
                if (ints.get(i) == ints.get(j)) {
                    ints.remove(j);
                }
            }
        }

        for (int i = 0; i < ints.size(); i++) {
            System.out.print(ints.get(i) + " ");
        }
    }
}
