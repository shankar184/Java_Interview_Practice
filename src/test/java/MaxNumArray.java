public class MaxNumArray {
    public static void main(String[] args) {
        int[] numArray = {12, 23, 423, 51, 500};


        int max = numArray[0];
//        for minimum number logic is min > num
        for (int num : numArray) {
            if (max < num) {
                max = num;

            }
        }
        System.out.println(max);
    }
}






