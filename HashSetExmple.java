
import java.util.HashSet;

public class HashSetExmple{
    public static void main(String[] args) {
        
        HashSet hs = new HashSet();
        hs.add("Nitesh");
        hs.add(23);
        hs.add(56.1);

         System.out.println("hashset is :" +hs);
         System.out.println("contains:" +hs.contains("rushi"));

         hs.remove(23);
         System.out.println("after removing object hashset is :" +hs);

         System.out.println("is empty :" +hs.isEmpty());

         hs.clear();
         System.out.println("after clear method hashset is :" +hs);

    }
}