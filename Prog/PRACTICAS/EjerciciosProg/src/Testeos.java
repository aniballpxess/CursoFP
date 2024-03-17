import com.sun.jdi.IntegerValue;

public class Testeos {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Your code to be measured goes here
        //--------------------------------------------------------------------------------------------------------------

        

        //--------------------------------------------------------------------------------------------------------------
        // Your code to be measured ends here

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("\nExecution time: " + executionTime + " milliseconds");
    }

    // Your clases and functions go here
    // -----------------------------------------------------------------------------------------------------------------

    // -----------------------------------------------------------------------------------------------------------------

}