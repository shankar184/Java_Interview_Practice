public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "I am a software Tester";        // Step 1: Input sentence
        String[] words = sentence.split(" ");   // Step 2: Split sentence into words

        String result = ""; // Step 3: Final result with reversed words

        // Step 4: Loop through each word
        for (String word : words) {
            String reversed = ""; // Reverse one word at a time

            // Step 5: Reverse the current character
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            // Step 6: Add reversed word to result with space
            result += reversed + " ";
        }

        // Step 7: Print final reversed-word sentence
        System.out.println("Reversed words: " + result);
    }
}
