package Array;
import java.util.*;
public class PresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int nums[] = new int[size];

        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for(int i=0; i<size;i++){
            if(nums[i] == x){
                System.err.println("The number is present");
            }
             System.out.println("The number is not present");
        }
           // System.out.println("The number is not present");
    }
}
