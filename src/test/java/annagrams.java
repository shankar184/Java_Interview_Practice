import java.util.Arrays;

public class annagrams {
    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "silent";
        char[] arr1 = new char[256];
        arr1 = str1.toCharArray();
        char[] arr2 = new char[256];
         arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("strings are Annagrams");
        }else{
            System.out.println("they are not annagrams");
        }
    }
}
