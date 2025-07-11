import org.testng.util.Strings;

public class Fibonacci {
    public static void main(String[] args){

//        first define fib length>>then create array of same length>>array of 0 and 1 nth index should be
//        of valaue of 0 and 1

        int fiblength=10;
        int[] num = new int[fiblength];
        num[0]=0;
        num[1]=1;
        for (int i=2;i<fiblength;i++){
            num[i]= num[i-1]+num[i-2];
        }
        System.out.println("Fibonacci series:");
        for(int i=0;i<fiblength;i++){
            System.out.println(num[i]+"");
        }

    }

}
