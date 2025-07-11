public class ReverseSentence {
    public static void main(String[] args) {
        String input = "I am a Software Tester";

        // Split the sentence into words
        String[] words = input.split(" ");

        // Use StringBuilder to construct the reversed sentence
        StringBuilder reversed = new StringBuilder();

        // Loop from the end of the array to the start
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        // Output the result
        System.out.println("Reversed sentence: " + reversed.toString());
    }
}
