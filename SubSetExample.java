
import java.util.*;

public class SubSetExample{

    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50};

        TreeSet<Integer> set = new TreeSet<>();

        for(int num : arr){
            set.add(num);

        }
        
        TreeSet<Integer> subset = new TreeSet<>(set.headSet(40));

        System.out.println("Elements less than 40: " + subset);
    }
}