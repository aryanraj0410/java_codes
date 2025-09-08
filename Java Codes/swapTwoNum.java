// 05 | Java Program To Swap Values Of Two Variables
import java.util.*;

public class swapTwoNum {
    public static void main(String[] args) {
        
        int a = 4;
        int b = 5;
        int temp;
    
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
