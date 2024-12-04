import java.util.Scanner;

public class meeqvse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(s1);

        for (int i = 0; i < s1.length()-1; i++) {
            if (s1.charAt(i) == s1.charAt(i+1)) {
                stringBuilder.deleteCharAt(i);
            }
        }

        System.out.println(stringBuilder);
    }
}