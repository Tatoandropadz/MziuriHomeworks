package Saklaso1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            Boolean theOne = true;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    theOne = false;
                }
            }

            if (theOne) {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
