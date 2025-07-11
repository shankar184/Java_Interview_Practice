public class GetCapitalisedWordInTheString {
    public static void main(String[] args){
        String input = "SoFtareTeStiNg";
        capitalisedChars(input);



    }
    public static int capitalisedChars(String input){

        int count = 0;
        String result = " ";
        for (int i=0;i<input.length();i++){


            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)){
                count++;
                result+= ch;
            }
        }
        System.out.println("Total chars:"+count);
        System.out.println(("Chars are:"+ result));
        return count;

    }

}
