package Practice;
import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        String orginal = "aryan";

        //using string builder
        String reversed  = new StringBuilder(orginal).reverse().toString();
        System.out.println(reversed);
    }
}
