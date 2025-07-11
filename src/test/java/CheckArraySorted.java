import java.util.Arrays;

public class CheckArraySorted {
    public static void main(String[] str){
        int[] arr = {1,6,3,5,4};
        boolean isSorted = true;

//        Arrays.sort(arr);
        System.out.println("sorted array is:" +arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]>arr[i+1]){
                isSorted= false;
                break;
            }
        }
        System.out.println("Is the array is sorted:" +isSorted);
    }
}
