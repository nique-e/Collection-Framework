import java.util.*;
public class CombineLinkedHashSets{

    public static void main(String[] args) {
         Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Second LinkedHashSet
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(5);

        // Combine both sets (order preserved, duplicates removed)
        Set<Integer> combinedSet = new LinkedHashSet<>(set1);
        combinedSet.addAll(set2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Combined (Order Preserved): " + combinedSet);
    }
}