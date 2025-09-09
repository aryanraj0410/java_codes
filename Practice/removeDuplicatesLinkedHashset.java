package Practice;

import java.util.LinkedHashSet;

public class removeDuplicatesLinkedHashset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        LinkedHashSet<Integer> duplicate = new LinkedHashSet<>();

        for(int n : arr){
            duplicate.add(n);
        }
        System.out.println(duplicate);
    }
}
