
import java.util.Vector;

public class VectorGeneric{

    public static void main(String[] args) {
        
        Vector<Integer> rollno = new Vector<Integer>();

        rollno.add(30);
        rollno.add(50);
        rollno.add(70);

        System.out.println("" +rollno);

        // Iterator  rn = rollno.iterator();
        for(Integer i : rollno){
             rollno.set(1, 60);
             System.out.println(i);
        }

 }
}