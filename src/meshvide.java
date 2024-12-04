import java.util.Scanner;

public class meshvide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        if (s.length() > 10) {
            char c1 = s.charAt(0);
            char c2 = s.charAt(s.length()-1);
            int n = s.length()-2;
            String s2 = Integer.toString(n);
            String ans = c1 + s2 +c2;
            System.out.println(ans);
        }
        else {
            System.out.println(s);
        }
    }
}