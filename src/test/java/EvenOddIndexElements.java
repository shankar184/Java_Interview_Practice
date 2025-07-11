public class EvenOddIndexElements {
    public static void main(String[] args){
        String[] elements = {"java","selenium","maven","docker","jenkins","testNG"};

        System.out.print("Even elements are : ");
        for (int i=0;i<elements.length;i+=2){
            System.out.print(elements[i] +",");
        }
        System.out.print("\nOdd elements are : ");
        for (int i=1;i<elements.length;i+=2){
            System.out.print(elements[i] +"," );
        }
    }
}
