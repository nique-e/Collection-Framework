
import java.util.ArrayList;

public class GenericCollection{

    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();
        al.add(23);
        al.add("nitesh");
        int flag = 0;

        for(int i = 0; i<al.size(); i++){
            if(al.get(i).equals("nite")){
                flag++;
            }

        }
        if(flag == 0){
            System.out.println("nitesh object does not exist");
        }
        else{
            System.out.println("nitesh object exist");
        }
    }
}