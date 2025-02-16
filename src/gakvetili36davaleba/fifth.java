package gakvetili36davaleba;

public class fifth {
    public static void main(String[] args) {
        int n = 19;
        String s = IntToSring(n);
        System.out.println(s);

        System.out.println(PrimeDetection2(n));
    }

    static String IntToSring (int n) {
        String ans = ""+n;
        return ans;
    }

    static Boolean PrimeDetection2 (int n) {
        for (int i = 2; i < n; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
