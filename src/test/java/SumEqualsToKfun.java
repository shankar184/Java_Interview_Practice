
// Importing necessary classes
import java.util.HashMap;
import java.util.Map;

public class SumEqualsToKfun {

    // Method to count number of subarrays with sum equal to k
    public static void SumEqualstoKFun(int[] arr, int k) {

        // Initialize prefix sum and answer
        int sum = 0;      // This will store cumulative (prefix) sum
        int ans = 0;      // This will store the final count of subarrays

        // HashMap to store frequency of prefix sums
        Map<Integer, Integer> map = new HashMap<>();

        // Initial entry: prefix sum 0 occurs once (helps handle cases where subarray starts from index 0)
        map.put(0, 1);

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {

            // Update the running prefix sum
            sum += arr[i];

            // Calculate the remaining sum needed to reach 'k'
            int rem = sum - k;

            // If that remaining sum was seen before, it means there's a subarray ending at i with sum k
            if (map.containsKey(rem)) {
                ans += map.get(rem);  // Add the count of such subarrays to answer
            }

            // Update the frequency of the current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        // Print the total number of subarrays with sum equal to k
        System.out.println("Answer: " + ans);
    }

    // Main method to test the logic
    public static void main(String[] args) {
        // Input array
        int[] a = {3, 9, -2, 4, 1, -7, 2, 6, -5, 8, -3, -7, 6, 2, 1};

        // Desired subarray sum
        int k = 10;

        // Call the function
        SumEqualstoKFun(a, k);
    }
}
