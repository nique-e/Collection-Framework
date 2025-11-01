
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo{

    public static void main(String[] args) {
        
        Queue q = new ArrayDeque<>();
        q.add("mouse");
        q.add(900);
        q.add("bootle");
        q.add(546.1);

        System.out.println("queue is :" +q);

        System.out.println("head objeat of queue:" +q.element());
        q.offer('%');

       
        System.out.println("after queue is :" +q);
        System.out.println("peek :" +q.peek());
        System.out.println("after peek queue is :" +q);

        System.out.println("poll:" +q.poll());
        System.out.println("after poll queue is :" +q);

    }
}