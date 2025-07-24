public class ReverseWithSpecialChars {
    public static void main(String[] args) {
        String input = "uqgggw##^$bjabsjb"; // Step 1: Input string
        char[] chars = input.toCharArray(); // Step 2: Convert string to char array (easier to swap)

        int left = 0;                  // Step 3: Left pointer starts from beginning
        int right = chars.length - 1;  // Step 4: Right pointer starts from end

        // Step 5: Loop until both pointers meet
        while (left < right) {
            // Step 6: If left char is NOT a letter, skip it
            if (!Character.isLetter(chars[left])) {
                left++;
            }
            // Step 7: If right char is NOT a letter, skip it
            else if (!Character.isLetter(chars[right])) {
                right--;
            }
            // Step 8: If both are letters, swap them
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                // Move both pointers inward
                left++;
                right--;
            }
        }

        // Step 9: Convert back to string and print result
//        String result = new String(chars);
        System.out.println("Reversed without special chars: " + new  String(chars));
    }
}
