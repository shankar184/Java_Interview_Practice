import java.util.HashMap;

public class charFrequency {
    public static void main(String[] args) {
        String input = "automationengineer"; // Step 1: Input string

        // Step 2: Use HashMap to store character frequencies
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Step 3: Loop through string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // Get current character

            // Step 4: If already in map, increment count, else add with 1
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.getOrDefault(ch,0) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        // Step 5: Print character frequencies
        System.out.println("Character frequencies:");
        for (char ch : freqMap.keySet()) {

            System.out.println(ch + " : " + freqMap.get(ch));
        }
    }
}
