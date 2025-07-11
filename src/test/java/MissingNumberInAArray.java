public class MissingNumberInAArray {
    public static void main(String[] args){
        int[] input = {1,2,4,5};
        int result = findMissingNumber(input);
        System.out.println(result);

    }
    public static int findMissingNumber(int[] input){
        int n = input.length+1;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for (int num :input){
            actualSum+= num;
        }
        return expectedSum-actualSum;

    }
}
