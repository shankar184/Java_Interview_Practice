import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] input = {1,2,3,4,5};
        System.out.println("Before reversing :" + Arrays.toString(input));
        reverseArray(input);
        System.out.println("After Reversing :" + Arrays.toString(input));

    }
    public static void reverseArray(int[] input){
        int start = 0;
        int end = input.length-1;
        while (start<end) {
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }

    }

    }

