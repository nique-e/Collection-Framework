import java.util.*;

public class RemoveDuplicateElements{
    public static void main(String[] args) {
        // Input array
        int[] arr = {5, 3, 5, 2, 1, 3};

        // LinkedHashSet order maintain karta hai aur duplicates remove karta hai
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        // Output print kar rahe hain
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("After Removing Duplicates (Order Maintained): " + set);
    }
}
