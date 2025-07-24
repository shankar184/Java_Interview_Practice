import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RemoveDupicatesFromArrayList {


        public static void main(String[] args) {
            List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana");

            Map<String, Integer> map = new LinkedHashMap<>();
            for (String item : list) {
                map.put(item, map.getOrDefault(item, 0) + 1);
            }

            System.out.println("Unique Elements: " + map.keySet());
            System.out.println("Counts: " + map);
        }
    }


