package Practice;
import java.util.*;
public class findLargest {
    public static void main(String[] args) {
        int[] arr = {2,5,8,1,5,86,50};

        int max_int = arr[0];

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max_int){
                max_int = arr[i];
            }
        }
        System.out.println(max_int);
    }
}
