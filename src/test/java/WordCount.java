// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class WordCount {
    public static void main(String[] args) {
        String input="india is my countrym my country is india";
//        String str =input.replace(".","").toLowerCase();
        String[] words= input.split(" ");
        HashMap<String,Integer> wordCount = new HashMap<>();
        for(String word:words){
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        }
        System.out.println(wordCount);



    }
}