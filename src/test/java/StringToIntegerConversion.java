public class StringToIntegerConversion {
    public static void main(String[] args){
        String num = "3+5*3";
        int number = Integer.valueOf(num);
        int number1 = Integer.parseInt(num);
        System.out.println("Extracted number is :" +number1);

        String str = Integer.toString(number1);
        System.out.println("Extracted string is :" + str);
    }

}
//  character to string....> String str = String.valueOf(char c)