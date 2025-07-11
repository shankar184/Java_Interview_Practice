import com.aventstack.chaintest.plugins.ChainTestListener;
import org.testng.annotations.Listeners;

public class RemoveDuplicateString {

    public static void main(String[] args){
        String str = "hello hello World";
        System.out.println("remove duplicates :" +removeDuplicate(str));

    }
    public static String removeDuplicate(String str){
        StringBuilder builder = new StringBuilder();
        boolean[] seen = new boolean[256];
        for(char ch: str.toCharArray()){
            if(!seen[ch]){
                builder.append(ch);
                seen[ch]= true;
            }
        }
        return builder.toString();


    }
}
