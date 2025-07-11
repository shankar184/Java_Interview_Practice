import java.util.LinkedHashMap;
import java.util.Map;

public class A1B2C3Pattern {
    public static void main(String[] args) {
        String str = "ABBCCDDDAAD"; // Example input

        // Use LinkedHashMap to preserve the order of first occurrence
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get current character
            map.put(ch, map.getOrDefault(ch, 0) + 1); // Update frequency
        }

        // Print all entries in a single row: A2B3C2D4
//        entrySet(),getKey(),getValue().....
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }
}


