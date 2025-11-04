
// import java.util.LinkedHashSet;
import java.util.*;

public class AddElementsFromUser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Set<String> set = new LinkedHashSet<>();

        System.out.println("Enter 5 string :");

        for(int i = 1; i<= 5; i++ ){
            System.out.println("String " + i + " :");
            String str = sc.nextLine();
            set.add(str);

        }

        System.out.println("string in same (duplicates removed ) :");
        for(String s : set){
            System.out.println(s);
        }
        sc.close();
    }
}