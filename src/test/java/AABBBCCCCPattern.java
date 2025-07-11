public class AABBBCCCCPattern {
    public static void main(String[] args){
        String input = "a2b3c4";
        convertNumericToChar(input);

    }
    public static void convertNumericToChar(String input){
        for (int i=0;i<input.length();i++){
            if ((Character.isLetter(input.charAt(i)))){
                System.out.print(input.charAt(i));
            }
            else {
                int a = Character.getNumericValue(input.charAt(i));
                for (int j=1;j<a;j++){
                    System.out.print(input.charAt(i-1));
                }
            }
        }

    }

}
