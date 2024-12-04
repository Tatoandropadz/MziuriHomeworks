import java.util.Scanner;

public class mexute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.charAt(s.length()-1) == 'a' || s.charAt(s.length()-1) == 'e' || s.charAt(s.length()-1) == 'i' || s.charAt(s.length()-1) == 'o' || s.charAt(s.length()-1) == 'u' || s.charAt(s.length()-1) == 'y') {
            System.out.println("xmovnit");
        }
        else {
            System.out.println("tanxmovnit");
        }
    }
}