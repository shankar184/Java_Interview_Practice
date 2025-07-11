public class Duplicate {

    public static void main(String[] args){
        String str = "Hello hello world";
        String input = str.toLowerCase();
        String result = "";

        for(int i=0;i<input.length();i++){
           char ch =  input.charAt(i);
           if(result.indexOf(ch)== -1){
               result+= ch;
           }
        }
        System.out.println("After the removing the duplicates :" +result);

    }

}
