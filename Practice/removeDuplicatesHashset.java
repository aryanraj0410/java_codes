//used when order is not mattered

package Practice;
import java.util.*;
public class removeDuplicatesHashset {
    public static void main(String[] args) {
        int[] arr = {2,5,3,4,2,4,3,5,6,7};

        HashSet<Integer> duplicate = new HashSet<>();

        for(int num : arr){
            duplicate.add(num);
        }

        System.out.println(duplicate);
    }
}
