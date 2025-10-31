
import java.util.Stack;

public class StackExmple{
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(23);
        st.push("nitesh");
        st.push(2.7);
        st.push(true);
        st.push('#');

        System.out.println("stack is : " +st);
        
    }
}