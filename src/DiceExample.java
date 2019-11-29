import java.security.SecureRandom;

public class DiceExample {
    public static void main(String[] args)
    {
        int[] diceSum = new int[13];

        for (int i=1; i<=1000000; i++)
        {
            int sum = rollDice()+rollDice();
            diceSum[sum]++;
        }

        displayArray(diceSum);
    }

    /**
     * This method accepts an int array and displays
     * the results to the console
     */
    public static void displayArray(int[] array)
    {
        for (int i=2; i<array.length;i++)
            System.out.printf("%2d: %d%n", i, array[i]);
    }


    /**
     * This will simulate rolling a 6 sided die
     */
    public static int rollDice()
    {
        SecureRandom rng = new SecureRandom();
        return rng.nextInt(6)+1;
    }
}
