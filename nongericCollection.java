
import java.util.*;

public class nongericCollection{
    public static void main(String[] args) {
         List<Object> studendsData = new ArrayList<Object>();
        // List studendsData = new ArrayList();

        studendsData.add(50);
        studendsData.add("nitesh");
        studendsData.add(5.2);
        studendsData.add('A');

        studendsData.add(1,7999848319l);
        studendsData.addFirst("pune");
        studendsData.addLast("khm");
        System.out.println("contains :" +studendsData.contains("pun"));

        System.out.println( studendsData.lastIndexOf("khm"));

        // System.out.println(studendsData.get(3));

        // System.out.println( studendsData.indexOf(2));
        // System.out.println( studendsData.getLast());
        // System.out.println( studendsData.isEmpty());
        // System.out.println( studendsData.remove(3));
        // System.out.println( studendsData.remove(3));
        // System.out.println( studendsData.removeFirst());

        // System.out.println(studendsData.removeLast());

        // System.out.println(studendsData.set(3,"nitesh"));
        // System.out.println(studendsData.size());
        
    System.out.println(studendsData);
    }
}