
import java.util.ArrayList;

public class ArrayGeneric{
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();

        name.add("sahil");
        name.add("Rushi");
        name.add("Nitesh");

        System.out.println("genic collection is :" +name);

        name.sort(null);

        System.out.println("after sorting is :" +name);
    }
}