public class secondMaxNumberInArray {
    public static void main(String[] args) {
        // Step 1: Define and initialize an array
        int[] numbers = {12, 35, 1, 10, 34, 1};

        // Step 2: Initialize two variables to hold the maximum and second maximum
        int max = Integer.MIN_VALUE;      // Smallest possible integer value
        int secondMax = Integer.MIN_VALUE;

        // Step 3: Traverse the array
        for (int num : numbers) {
            // If current number is greater than max
            if (num > max) {
                // Update secondMax before changing max
                secondMax = max;
                max = num;
            }
            // If current number is less than max but greater than secondMax
            else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        // Step 4: Display the result
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second maximum element.");
        } else {
            System.out.println("The second maximum number is: " + secondMax);
        }
    }
}
