package Saklaso1;

import java.util.Scanner;
import java.util.ArrayList;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> str = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            String s = scanner.next();
            str.add(s);
        }

        int maxIndex = 0;
        int maxRep = 0;

        for (int i = 0; i < str.size(); i++) {
            int counter = 0;
            for (int j = 0; j < str.size(); j++) {
                if (str.get(i).equals(str.get(j))) {
                    counter++;
                }
            }

            if (counter > maxRep) {
                maxRep = counter;
                maxIndex = i;
            }
        }

        System.out.println(str.get(maxIndex));


        // aq maqvs dawerili logika ertistvis. ori an metistvis ubralod igive gafiltvris sistemas gamoviyeneb rac
        // mexuteshi miweria. daweras ubralod ver vaswreb
    }
}
