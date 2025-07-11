import java.util.Arrays;



    public class SecondLargestAndSecondSmallestNumberInArray {
        public static void main(String[] args) {
            // Step 1: Define and initialize an array
            int[] arr = {12, 35, 1, 10, 34, 1};

            // Step 2: Check if the array has at least 2 distinct elements
            if (arr.length < 2) {
                System.out.println("Array must have at least two elements");
                return;
            }

            // Step 3: Sort the array
            Arrays.sort(arr);  // Now the array is sorted in ascending order

            // Step 4: Find the second smallest and second largest
            int smallest = arr[0];                      // First (smallest) element
            int secondSmallest = -1;                    // Initialize with an invalid default
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != smallest) {               // Find first number greater than smallest
                    secondSmallest = arr[i];
                    break;
                }
            }

            int largest = arr[arr.length - 1];          // Last (largest) element
            int secondLargest = -1;                     // Initialize with an invalid default
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] != largest) {                // Find first number smaller than largest
                    secondLargest = arr[i];
                    break;
                }
            }

            // Step 5: Output results
            if (secondSmallest == -1)
                System.out.println("There is no second smallest element (all values might be same)");
            else
                System.out.println("Second Smallest: " + secondSmallest);

            if (secondLargest == -1)
                System.out.println("There is no second largest element (all values might be same)");
            else
                System.out.println("Second Largest: " + secondLargest);
        }
    }


