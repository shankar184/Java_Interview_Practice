public class ExtractIntegers {
    public static void main(String[] args) {
        String s = "[111,112,114,156,178]";

        // Remove the square brackets
        s = s.replace("[", "").replace("]", "");
        System.out.println(s);

        // Split the string by comma
        String[] numbers = s.split(",");


        // Print each number as integer
        for (String num : numbers) {
            int value = Integer.parseInt(num.trim());
            System.out.print(value);
        }
    }
}
