// David Bankole Abel
// A0236512

import java.util.Random;

public class diceGame {

  


    public static void main(String[] args) {

        Random r = new Random (); // Random number generator

        int d6 = 0; //
        int d9 = 0;


        for (int i = 0; i < 5; i++) {
           d6 = r.nextInt(6);
            d6++;

            for (int j = 0; j < 5; j++) {
                d9 = r.nextInt(9);
                 d9++;

            System.out.println("the six side die is "+d6);
            System.out.println("the nine side die is "+d9);
            }
        }
    }
}

