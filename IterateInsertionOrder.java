
import java.util.*;
public class IterateInsertionOrder{
    public static void main(String[] args) {

    Set<String> set = new LinkedHashSet<>();

    set.add("A");
    set.add("B");
    set.add("C");

    System.out.println("element in insertion order :");

    for(String element : set ){
        System.out.println(element +" ");
    }
    }
}