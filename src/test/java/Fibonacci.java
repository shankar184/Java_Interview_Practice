/**
 * The `Fibonacci` class generates and prints the Fibonacci series up to a specified length.
 */
public class Fibonacci {

    /**
     * The main method is the entry point of the program.
     * It calculates the Fibonacci series for a predefined length and prints it.
     *
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {

        // Define the length of the Fibonacci series
        int fiblength = 10;

        // Create an array to store the Fibonacci series
        int[] num = new int[fiblength];

        // Initialize the first two numbers in the Fibonacci series
        num[0] = 0;
        num[1] = 1;

        // Calculate the Fibonacci series starting from the 3rd element
        for (int i = 2; i < fiblength; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }

        // Print the Fibonacci series
        System.out.println("Fibonacci series:");
        for (int i = 0; i < fiblength; i++) {
            System.out.println(num[i] + "");
        }
    }
}