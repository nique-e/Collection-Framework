
import java.util.TreeSet;

public class FristElementLast{

    public static void main(String[] args) {
        
        int arr[] = {10,30,20,60,40,90,50};
        TreeSet<Integer> set = new TreeSet<>();

        for(int num : arr){
            set.add(num);

        }

        int fist = set.first();
        int last = set.last();

        System.out.println("First : "+fist+ " last : " +last);
    }
}