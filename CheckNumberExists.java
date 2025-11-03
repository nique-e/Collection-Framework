public class CheckNumberExists{
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int target = 5;
        boolean found = false;

        for(int num : arr){
            if(num == target){
                found = true;
                break;
            }

        }

        if(found){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}