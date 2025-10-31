
import java.util.LinkedHashSet;

public class RemoveSet{
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,1};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int num : arr){
            set.add(num);
        }
        System.out.println("array without duplicates :" +set);

    }
}