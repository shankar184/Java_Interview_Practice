public class secondMinimumNumberInAnArray {
    public static void main(String[] args){
        int[] num = {21,23,32,4,3,212,12};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int numbers: num){
            if (numbers < min){
                secondMin = min;
                min = numbers;
            } else if (numbers > min && numbers < secondMin) {
                secondMin = numbers;
                
            }
        }
        if (secondMin == Integer.MAX_VALUE){
            System.out.println("There is no second minimum number:" +secondMin);
        }
        else {
            System.out.println("the second minimum number is :" +secondMin);
        }

    }
}
