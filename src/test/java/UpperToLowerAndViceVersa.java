public class UpperToLowerAndViceVersa {
    public static void main(String[] args) {
        String input = "HexAwarE";
        StringBuilder result = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If uppercase, convert to lowercase
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            }
            // If lowercase, convert to uppercase
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // Keep other characters unchanged
            }
        }

        // Output the result
        System.out.println("Original: " + input);
        System.out.println("Swapped:  " + result.toString());
    }
}