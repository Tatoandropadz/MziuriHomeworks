import java.util.Scanner;

public class meore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?' || s.charAt(i) == '!' || s.charAt(i) == '.')
            {
                ans++;
            }
        }

        System.out.println(ans);
    }
}