public class NonRepeatingSubString {
    public static void main(String[] args) {
        String input = "daabcbaabcbc";
        String longest = "";
        String current = "";

        for (char c : input.toCharArray()) {
            String ch = String.valueOf(c);

            // If character already exists in current substring
            if (current.contains(ch)) {
                // Remove characters up to and including the repeated one
                current = current.substring(current.indexOf(ch) + 1);
            }

            current += ch; // Add current character

            // Update longest if current is longer
            if (current.length() > longest.length()) {
                longest = current;
            }
        }

        System.out.println("Longest unique substring: " + longest);
        System.out.println("Length: " + longest.length());
    }
}
