

public class RemoveOccurance {

    // Method to remove all occurrences of 'part' from 'str'
    public static String removeOccurrence(String str, String part) {
        // Use StringBuilder to efficiently build the resulting string
        StringBuilder sb = new StringBuilder();

        // Convert input string to character array and iterate over each character
        for (char ch : str.toCharArray()) {
            sb.append(ch); // Append the current character to StringBuilder

            // If the current length is at least the size of 'part', check for a match
            if (sb.length() >= part.length()) {
                // Extract the substring from the end of StringBuilder with same length as 'part'
                String end = sb.substring(sb.length() - part.length());

                // If it matches the 'part', remove it
                if (end.equals(part)) {
                    sb.setLength(sb.length() - part.length()); // Delete the matched part from the end
                }
            }
        }

        // After processing all characters, return the final string
        return sb.toString();
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Original string and part to remove
        String str = "daabcbaabcbc";
        String part = "abc";

        // Call the method to remove all occurrences
        String result = removeOccurrence(str, part);

        // Output the final result
        System.out.println("Final String -- " + result);  // Expected Output: "dab"
    }
}
