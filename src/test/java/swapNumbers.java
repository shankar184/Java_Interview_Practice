public class swapNumbers {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        System.out.println("Before swapping: a = " + a +",b = " + b);

        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a = " + a +",b = " + b);

    }

}
