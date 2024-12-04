import java.util.Scanner;

public class mesame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Boolean truth = true;

        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                truth = false;
            }
        }

        if (truth) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}