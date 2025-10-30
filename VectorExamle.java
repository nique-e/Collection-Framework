import java.util.Vector;

public class VectorExamle{
 public static void main(String[] args) {
     
     Vector<String> v = new Vector<>();

      v.add("Nitesh");
        v.add("Rushi");
        v.add("Nitesh"); // duplicate allowed
        System.out.println(v);

 }
}