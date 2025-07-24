public class RemoveDuplicatesInArray {



    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 2, 5, 3};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}



// public static void main(String[] args) {
//        int[] arr = {5, 2, 8, 2, 5, 3};
//        Map<Integer, Integer> map = new LinkedHashMap<>();
//
//        for (int num : arr) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        for (int num : map.keySet()) {
//            System.out.print(num + " ");
//        }
//    }



//or



// int[] arr = {5, 2, 8, 2, 5, 3};
//
//        // Convert to Set to remove duplicates
//        Set<Integer> set = new LinkedHashSet<>(); // keeps insertion order
//        for (int num : arr) {
//            set.add(num);
//        }
//
//        // Convert back to array (optional)
//        Integer[] uniqueArray = set.toArray(new Integer[0]);
//
//        // Print result
//        System.out.println(Arrays.toString(uniqueArray));
//    }