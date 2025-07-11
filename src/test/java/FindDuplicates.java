import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 2, 5, 6, 1};

        // HashSet to keep track of seen numbers
        HashSet<Integer> seen = new HashSet<>();

        // HashSet to store duplicates
        HashSet<Integer> duplicates = new HashSet<>();

        // Loop through each number in the array
        for (int number : numbers) {
            // If number is already in 'seen', it's a duplicate
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        // Printing duplicates
        System.out.println("Duplicate elements are: " + duplicates);
    }
}
