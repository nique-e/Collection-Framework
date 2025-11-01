
import java.util.LinkedHashMap;

public class LinedHashMap{

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> bankMap = new LinkedHashMap<>();

        bankMap.put(101, "nitesh");
        bankMap.put(102, "Rushi");
        bankMap.put(103, "sahil");
        bankMap.put(104, "vijay");
        
        System.out.println("frineds name :" +bankMap);

        System.out.println("friends 102 :" +bankMap.get(102));

        bankMap.remove(103);

        System.out.println("contains friends" +bankMap.containsValue("kunal"));
        System.out.println("contains key 105 :" +bankMap.containsKey(105));

        System.out.println("friends names order :");
        for(Integer key : bankMap.keySet()){
            System.out.println(key +"" +bankMap.get(key));
        }
        
    }
}