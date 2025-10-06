package Practice;
import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        String orginal = "aryan";

        //using string builder
        // String reversed  = new StringBuilder(orginal).reverse().toString();
        // System.out.println(reversed);
        
        String revString = " ";
        for(int i = orginal.length()-1;i>=0;i--){
            revString += orginal.charAt(i);
        }
        System.out.println(revString.trim());
    }
}
