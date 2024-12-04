import java.util.Scanner;

public class pirveli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)== '1' || s.charAt(i)== '2' || s.charAt(i)== '3' || s.charAt(i)== '4' || s.charAt(i)== '5' || s.charAt(i)== '6' || s.charAt(i)== '7' || s.charAt(i)== '8' || s.charAt(i)== '9' || s.charAt(i)== '0')
            {
                ans++;
            }
        }

        System.out.println(ans);
    }
}