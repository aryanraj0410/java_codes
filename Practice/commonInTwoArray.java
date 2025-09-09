package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class commonInTwoArray {
    public static Integer[] commonElements(Integer[] arr1, Integer[] arr2){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> common = new HashSet<>();

        for(Integer num : arr2){
            if(set1.contains(num)){
                common.add(num);
            }
        }
        return common.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1,2,4,5,6,7,8};
        Integer[] arr2 = {1,3,10,4,6};

        Integer[] commons = commonElements(arr1, arr2);
        System.out.println("Common elements are: "+Arrays.toString(commons));
    }
}
