import java.util.ArrayList;

public class EvenOddNumbers {
    public static void main(String[] args){
        int[] number = {1,4,8,9,4,3,5,10};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

//        Iterate over each number
        for (int num : number){
            if (num % 2 == 0){
                even.add(num);
            }
            else {
                odd.add(num);
            }
        }
        System.out.println("Even numbers are : " + even);
        System.out.println("Odd number are : "+ odd);
    }

}
