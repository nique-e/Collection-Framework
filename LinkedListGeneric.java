
import java.util.LinkedList;


public class LinkedListGeneric{
    public static void main(String[] args) {
        
        LinkedList l = new LinkedList();

        l.add("nitesh@gsm.com");
        l.add(23);
        l.add("nitesh");
        l.add('#');

        System.out.println(l.offer(56));
        l.add(81.2);

        System.out.println("peek :" +l.peek());
        System.out.println("poll :" +l.poll());
        System.out.println("linkestList :" +l);

    }
}