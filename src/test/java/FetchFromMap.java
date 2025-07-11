import java.util.HashMap;
import java.util.Map;

public class FetchFromMap {
    public static void main(String[] args){
        Map<String,String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA","Washington D.C");
        countryCapitalMap.put("India","New Delhi");
        countryCapitalMap.put("France","Paris");
        for(String country: countryCapitalMap.keySet()){
            String capital = countryCapitalMap.get(country);
            System.out.println(country+" --> " + capital);
        }
    }
}
