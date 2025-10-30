
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> sweets = new TreeSet<String>();
        sweets.add("jaledi");
        sweets.add("ladu");
        sweets.add("pedha");
        sweets.add("barfi");

        System.out.println("sweets are :" + sweets);

        System.out.println("contains:" + sweets.contains("basundi"));
        System.out.println("sweets are:" + sweets);

        // decendingSet, iterator,clear,getfrist,getlast,
        System.out.println("decendingSet :" + sweets.descendingSet());

        Iterator<String> it = sweets.iterator();
        System.out.print("Using Iterator: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        
            sweets.clear();
            System.out.println("Ater clear :" +sweets);

            System.out.println("size :" + sweets.size());
            System.out.println("floor :" + sweets.floor("gajar halwa"));
            System.out.println("fist :" + sweets.first());
            System.out.println("lower :" + sweets.lower("rasmalai"));
            System.out.println("higher :" + sweets.higher("bundi"));


            System.out.println("frist elements :" +sweets.getFirst());
            System.out.println("last elements:" +sweets.getLast());
            System.out.println(sweets.descendingSet());



        }
    }

    }
