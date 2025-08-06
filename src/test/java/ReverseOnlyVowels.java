// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashMap;
import java.util.Map;
import java.util.*;
class ReverseOnlyVowels {
    public static void main(String[] args) {
        // a e i o u
        String input = "automation";
        String vowels = "aeiouAEIOU";
        char[] arr = input.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left pointer to vowel
            while (left < right && vowels.indexOf(arr[left]) == -1) {
                left++;
            }
            // Move right pointer to vowel
            while (left < right && vowels.indexOf(arr[right]) == -1) {
                right--;
            }
            // Swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed Vowels: " + new String(arr));
    }

}


