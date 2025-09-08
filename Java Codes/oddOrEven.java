//01 | Java Program To Check Given Number Is Odd Or Even
import java.util.*;
class oddOrEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }

    }
}
