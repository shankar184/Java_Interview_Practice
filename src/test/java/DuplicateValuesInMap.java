import java.util.*;

public class DuplicateValuesInMap {
    public static void main(String[] args) {
        // Sample map with some duplicate values
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Apple");
        map.put(4, "Orange");
        map.put(5, "Banana");
        map.put(6, "Grapes");

        // To track value frequency
        Map<String, Integer> freqMap = new HashMap<>();

        // Count occurrences of each value
        for (String ch : map.values()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Print duplicate values
        System.out.println("Duplicate values in the map:");
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
