public class ReverseWordsWithPositionStatic {
    public static void main(String[] args) {

        String str = "india is my country";

        // Convert string to char array (because String is immutable)
        char[] ch = str.toCharArray();

        int left = 0;
        int right = ch.length - 1;

        // Keep swapping until pointers meet
        while (left < right) {

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        // Convert char array back to String
        String reversed = new String(ch);

        System.out.println(reversed);
    }
}
