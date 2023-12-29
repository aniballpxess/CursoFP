import java.util.Random;
import java.util.Scanner;

public class Testeos {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Your code to be measured goes here
        //--------------------------------------------------------------------------------------------------------------
        var rng = new Random();
        var input = new Scanner(System.in);
        int counter = 0;

        System.out.print("¿Cuantas cifras quieres que tenga el número ganador (5, 6 ó 7)?: ");
        int length = Integer.parseInt(input.nextLine());
        int winner = (int) (rng.nextDouble() * Math.pow(10, length));
        System.out.println("Número ganador: " + winner);

        while (true) {
            int lotteryTicket = (int) (rng.nextDouble() * Math.pow(10, length));
            counter++;

            if (lotteryTicket == winner) {
                break;
            }
        }
        System.out.println("Número de intentos: " + counter);
        //--------------------------------------------------------------------------------------------------------------
        // Your code to be measured ends here

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Execution time: " + executionTime + " milliseconds");
    }

    // Your clases and functions go here
    // -----------------------------------------------------------------------------------------------------------------

    // -----------------------------------------------------------------------------------------------------------------

}