public class Palindrome {
    public static void main(String[] args){
        String str = "system";
        System.out.println(isPalindrome(str));


    }
    public static boolean isPalindrome(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);

    }


}
