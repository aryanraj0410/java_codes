// 04 | Java Program to Check Given Number Is Positive Negative Or Zero
package Practice;
import java.util.*;
public class posNegOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        if(a >0){
            System.out.println("Positive.");
        } else if(a == 0){
            System.out.println("Zero.");
        } else {
            System.out.println("Negetive.");
        }
        sc.close();
    }
}
