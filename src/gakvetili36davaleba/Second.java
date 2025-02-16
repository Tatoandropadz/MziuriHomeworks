package gakvetili36davaleba;

import java.util.function.*;

public class Second {
    public static void main(String[] args) {
        Consumer <String> errorchecker = message -> {
            if(message.contains("connected")) {
                System.out.println("INFO");
            }
            else if (message.contains("low")) {
                System.out.println("WARNING");
            }
            else if (message.contains("crash")){
                System.out.println("ERROR");
            }
            else {
                System.out.println("INCORRECT INPUT");
            }
        };

        errorchecker.accept("low disk warning!");
    }
}
