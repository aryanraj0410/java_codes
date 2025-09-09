package Practice;
import java.util.Arrays;

public class duplicateArrayElements {
    public static void main(String[] args) {
        int[] arr = {2,4,35,3,6,2,6,8,2,6,9,12,6,8};
        Arrays.sort(arr);

        for(int i = 0; i<arr.length;i++){
            if(arr[i] == arr[i+1]){
                System.out.println(arr[i]);

                while( i< arr.length-1 && arr[i] == arr[i+1]){
                    i++;
                }
            }
        }
    }
}
