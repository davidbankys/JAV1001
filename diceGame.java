import java.util.Random;

public class diceGame {

  


    public static void main(String[] args) {

        Random r = new Random ();

        int d20 = 0; //number of sides

        for (int i = 0; i < 20; i++) {
           d20 = r.nextInt(20);
            d20++;

            System.out.println("you rolled a "+d20);
        }
    }
}