package Saklaso1;

import java.util.ArrayList;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Character> chars = new ArrayList<>();

        String s = scanner.next();

        for (int i = 0; i < s.length(); i++) {
            chars.add(s.charAt(i));
        }

        for (int i = 0; i < chars.size(); i++) {
            for (int j = i+1; j < chars.size(); j++) {
                if (chars.get(i) == chars.get(j)) {
                    chars.remove(j);
                    j--;
                }
            }
        }

        for (int i = 0; i < chars.size(); i++) {
            int counter = 0;
            for (int j = 0; j < s.length(); j++) {
                if (chars.get(i) == s.charAt(j)) {
                    counter++;
                }
            }

            System.out.println(chars.get(i) + "=" + counter);
        }
    }
}
