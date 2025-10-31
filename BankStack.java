
import java.util.Scanner;
import java.util.Stack;

public class BankStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> bank = new Stack<>();

        System.out.println("Enter the size of stack :");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String bankName = sc.nextLine();
            bank.push(bankName);
        }
        System.out.println("befor removing bank colletion:" +bank);

        for(int i = 0; i<n; i++){
            String b = bank.get(i);
            if(b.equalsIgnoreCase("SBI")){
                bank.remove("SBI");
            }

        }

        System.out.println("after removing bank colletion is :" +bank);
       
    }
}
