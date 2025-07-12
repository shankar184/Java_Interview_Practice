import java.util.Arrays;


    public class RotateArray {
        public static void main(String[] args) {
            int[] input = {1, 2, 3, 4, 5};
            int n = 1;

            // Normalize n if it's greater than array length
//            n = n % input.length;

            int[] result = new int[input.length];

            // Copy last n elements to the beginning
            System.arraycopy(input, input.length - n, result, 0, n);

            // Copy the rest to the end
            System.arraycopy(input, 0, result, n, input.length - n);

            System.out.println("Rotated Array: " + Arrays.toString(result));
        }
    }


