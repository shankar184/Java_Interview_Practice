public class ReverseOnlyTheFirstWord {
    public static void main(String[] args) {
        String input = "my country is india";
        int firstSpace = input.indexOf(" ");
        String first = input.substring(0, firstSpace);
        String last = input.substring(firstSpace + 1);
        System.out.println(new StringBuilder(first).reverse() + " " + last);
    }
}
