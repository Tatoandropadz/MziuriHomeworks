package gakvetili36davaleba;

import java.util.Random;
import java.util.function.*;

public class first {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] SYMBOLS = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        final int PASSWORDSIZE = 8;

        Supplier <String> randompassword = () -> {
          String password = "";
          for (int i = 0; i < PASSWORDSIZE; i++) {
              int n = rand.nextInt(0, 36);
              password+=SYMBOLS[n];
          }

          return password;
        };


        System.out.println(randompassword.get());
    }
}
