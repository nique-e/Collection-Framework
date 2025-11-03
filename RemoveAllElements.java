
import java.util.HashSet;

public class RemoveAllElements{
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);

        System.out.println("Before removeing : " +num);

        num.clear();

        if(num.isEmpty()){
            System.out.println("Hashset Empty");
        }
        else{
            System.out.println("Hashset not Empty :" +num);
        }
    }
}