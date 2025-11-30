
public class CheakElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int target = 25;

        boolean found = false;
        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
