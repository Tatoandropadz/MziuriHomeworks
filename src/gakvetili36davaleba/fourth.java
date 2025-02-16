package gakvetili36davaleba;

import java.util.function.*;

public class fourth {
    public static void main(String[] args) {
        Predicate <Integer> PrimeDetection = n -> {
          for (int i = 2; i < n; i++) {
              if(n%i==0) {
                  return false;
              }
          }

          return true;
        };


        System.out.println(PrimeDetection.test(15));
    }
}
