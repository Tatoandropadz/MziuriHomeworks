package gakvetili36davaleba;

import java.util.function.*;

public class third {
    public static void main(String[] args) {
        Function<String, String> shetrialeba = str -> {
            String s = "";
            for (int i = str.length()-1; i >= 0; i--) {
                s += str.charAt(i);
            }
            return s;
        };

        System.out.println(shetrialeba.apply("abc"));
    }
}
