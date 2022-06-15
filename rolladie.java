package rolladie;

import java.util.Random;

public class RollADie {


    public static void main(String [] args) {

        Random r = new Random ();

        int result = 0;

        for (int i = 0; i < 6; i++) {
          int result = r.nextInt(6);
            result++;

            System.out.println("you rolled a " + result);
        }
    }
}