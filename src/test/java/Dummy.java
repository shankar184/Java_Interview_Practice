import java.util.HashMap;

public class Dummy {
    public static void main(String[] args) {
        String[] s = {"000","123","344","000","8799"};
        HashMap<String,Integer> map = new HashMap<>();
        for (String str: s){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        System.out.println("The Enteries are:");
        for (String keys: map.keySet()){
            if (map.get(keys)>1){
                System.out.print(keys + "-->" + map.get(keys));
            }
        }


    }
}
