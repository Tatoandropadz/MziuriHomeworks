import java.util.Scanner;

public class meotxe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        Boolean contains = false;

        for (int i = 0; i < s1.length() - s2.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i+j) != s2.charAt(j)) {
                    break;
                }

                if (j == s2.length()-1) {
                    contains = true;
                }
            }
        }


        if (contains) {
            System.out.println("sheicavs");
        }
        else {
            System.out.println("ar sheicavs");
        }
    }
}