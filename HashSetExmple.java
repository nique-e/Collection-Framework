
import java.util.HashSet;
import java.util.LinkedHashSet;

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

         HashSet hs2 = new HashSet();
         hs2.add(10);
         hs2.add(20);

         hs2.addAll(hs);
         System.out.println("after add all :" +hs2);

         LinkedHashSet lhs = new LinkedHashSet();
         
         lhs.add("anbs");
         lhs.add(20);
         lhs.add(56.3);



    }
}