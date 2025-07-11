import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Main method - execution starts here
    public static void main(String[] args) {
     String input   = "nnnsddd";

        char result = findFirstNonRepeatingChar(input); // Call method to find character

        if (result != 0) {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>(); // LinkedHashMap maintains insertion order

        // Step 1: Count the frequency of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1); // Increment count or set to 1
        }


        // Step 2: Iterate through LinkedHashMap to find the first character with count 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey(); // Return the first non-repeating character
//                If you need all the non-repeating chars then System.out.print(entry.getKey());
            }
        }

        return 0; // Return null character if no non-repeating character is found
    }
}
