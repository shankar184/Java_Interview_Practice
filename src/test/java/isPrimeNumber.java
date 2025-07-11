public class isPrimeNumber {
    public static void main(String[] args){
        int num = 3;
        boolean isPrime = true;

//        Edge case handling
        if(num <= 1){
            isPrime = false;
        }
//        Core logic

        for(int i = 2;i<= Math.sqrt(num);i++){
            if(num % 2 ==0){
                isPrime= false;
                break;
            }
            }
            if(isPrime){
                System.out.println(num +" is a prime number ");
            }
            else {
                System.out.println(num + " is not a prime number");

            }
        }
    }

