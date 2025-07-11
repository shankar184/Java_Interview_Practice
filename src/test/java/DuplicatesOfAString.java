import java.util.HashMap;
import java.util.Set;

public class DuplicatesOfAString {
    public static void main(String[] args) {
        String input = "IAmSoftwareEngineer";
        String str=input.toLowerCase();

        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }
        //   Set<Character> keys= freqMap.keySet();
        System.out.println("character frequencies:");
        for (char ch : freqMap.keySet()) {
            if (freqMap.get(ch) > 1)
                System.out.println(ch + "" + freqMap.get(ch));


        }
    }
}
