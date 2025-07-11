public class FrequentCharacter {
    public static void main(String[] args) {
        String input = "hello hello world";
        char ch = 'h';
        int count = 0;

        for (int i = 0; i < input.length();i++){
            if(ch == input.charAt(i)){
               count++;
            }
        }
        System.out.println( ch +" character count is: "+count );
    }

}
