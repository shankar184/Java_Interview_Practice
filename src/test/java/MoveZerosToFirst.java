public class MoveZerosToFirst {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 0, 12};

        int index = arr.length - 1;  // start from last position

        // Step 1: Move non-zero elements to the end
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index--;
            }
        }

        // Step 2: Fill remaining positions with zero
        while (index >= 0) {
            arr[index] = 0;
            index--;
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}