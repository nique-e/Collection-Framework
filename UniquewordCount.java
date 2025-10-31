
import java.util.HashSet;

public class UniquewordCount{
    public static void main(String[] args) {
        
        String str = "Nitesh sunil Mule";

        String[] words = str.split(" ");

        HashSet<String> uniqueword = new HashSet<>();
        for(String word  : words){
            uniqueword.add(word);
        }
        System.out.println("Number of unique words: " + uniqueword.size());

        System.out.println("Unique words are: " + uniqueword);
    }
}