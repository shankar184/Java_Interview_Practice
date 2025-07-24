public class vowelsConsonants {
    public static void main(String[] args){
        String input = "aeiouaeiou";
        input =  input.toLowerCase();
        int vowel = 0;
        int consonant = 0;
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
//            if(ch>='a' && ch<'z')
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowel++;
                }
            else{
                consonant++;
                }
        }
        System.out.println("vowels count is :" +vowel);
        System.out.println("consonants count is :" +consonant);

    }

}
