// Start with the low (first index) and high (last index).
// Find the mid index:
// mid = (low + high) / 2
// Compare arr[mid] with the target:
// If arr[mid] == target → found ✅
// If arr[mid] < target → search in right half (low = mid + 1)
// If arr[mid] > target → search in left half (high = mid - 1)
// Repeat until low > high (element not found).

package Practice;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};
        int target = 8;
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;

        while(low<=high){
            if(arr[mid] == target){
                System.out.println("Item found");
                break;
            }else if(arr[mid] < target){
                low = mid +1;
            }else{
                high = mid-1;
            }
            mid = (low+high)/2;
        }
        if(low>high){
            System.out.println("Item not found.");
        }
    }
}
