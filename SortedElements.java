
import java.util.TreeSet;

public class SortedElements{
    public static void main(String[] args) {
        int arr[] ={30,40,10,20,60};

        TreeSet<Integer> set = new TreeSet<>();

        for(int num : arr){
            set.add(num);

        }

        System.out.println("sorted elements :" +set);
    }
}