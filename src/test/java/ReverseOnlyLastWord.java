public class ReverseOnlyLastWord {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
    public static void main(String[] args) {
            System.out.println("Try programiz.pro");
            String input="my country is india";
            int lastSpace = input.lastIndexOf(" ");
            String first = input.substring(0,lastSpace+1);
            String last = input.substring(lastSpace+1);
            System.out.println(first+new StringBuilder(last).reverse());
        }
    }

