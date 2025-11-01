
import java.util.HashMap;
public class HashMapEx{

    public static void main(String[] args) {
        
     HashMap hsm = new HashMap();
     hsm.put(101,"nitesh");
     hsm.put(102,"Rush");
     hsm.put(103,5647447);

     System.out.println("nongeneric collectoin of :" +hsm);

    //  System.out.println("contains value :" +hsm.containsValue('Rush'));
    //  System.out.println("contain key :" +hsm.containsKey(103));


HashMap<Integer, String> emdata = new HashMap<>();
emdata.put(1,"sahil");
emdata.put(2, "hitesh");

System.out.println("generic collection of hashmap is :" +emdata);
emdata.replace(2, "jitesh");
System.out.println("replace value is :" +emdata);

    }
}