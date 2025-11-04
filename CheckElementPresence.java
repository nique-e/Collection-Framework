
// import java.util.LinkedHashSet;
import java.util.*;

public class CheckElementPresence{
    public static void main(String[] args) {
        
        Set<String> set = new LinkedHashSet<>();
        set.add("python");
        set.add("java");
        set.add("Cpp");
        set.add("html");

        String check = "java";

        if(set.contains(check)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}