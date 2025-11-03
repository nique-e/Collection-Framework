
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray{
    public static void main(String[] args) {
        int arr1[] ={1,2,3};
        int arr2[] ={2,3,4};

        Set<Integer> union = new HashSet<>();

        for(int num : arr1){
            union.add(num);
        }
        for(int num1 : arr2){
            union.add(num1);
        }
            System.out.println(union);
        
    }

}