
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

        st.pop();
        System.out.println("after pop stack is: " +st);
        
        st.remove(1);
        System.out.println("after is : ");

        System.out.println("capacity of stack :" +st.capacity());

        st.peek();
        System.out.println("after peek stack :" + st.peek());
        System.out.println("after search :" +(true));
        
    }
}