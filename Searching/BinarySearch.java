package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,9,11,14,16,30,60,70};
        int item = 70;
        int li = 0;
        int hi = arr.length-1;
        int mi = (li+hi)/2;

        while(li<=hi){
            if(arr[mi] == item){
                System.out.println("Item is found at "+mi+" index");
                break;
            }
            else if(arr[mi] < item){
                li = mi+1;
            }
            else{
                hi = mi-1;
            }
            mi = (li+hi)/2;
        }
        if(li>hi){
            System.out.println("Item not found.");
        }
     }
}
