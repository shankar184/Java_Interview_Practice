public class ReverseEachWord {


        public static void main(String[] args) {
            String input = "I am a software Tester";
            String output = reverseEachWord(input);
            System.out.println("Output: " + output);
        }

        // Method to reverse each word in the input string
        public static String reverseEachWord(String input) {
            // Split the input string by spaces to get individual words
            String[] words = input.split(" ");
            StringBuilder result = new StringBuilder();

            // Loop through each word
            for (String word : words) {
                // Reverse the current word using StringBuilder
                String reversedWord = new StringBuilder(word).reverse().toString();
                // Append the reversed word and a space
                result.append(reversedWord).append(" ");
            }

            // Trim the trailing space and return the final result
            return result.toString().trim();
        }
    }


