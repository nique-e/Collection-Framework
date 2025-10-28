
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayGeneric{
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> name = new ArrayList<String>();

        name.add("sahil");
        name.add("Rushi");
        name.add("Nitesh");

        System.out.println("genic collection is :" +name);

        name.sort(null);

        System.out.println("after sorting is :" +name);

        Iterator it=name.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
            Thread.sleep(1000);
        }
    }
}