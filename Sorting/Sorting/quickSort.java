package Sorting;

public class quickSort {
    static int partition(int arr[], int low, int high){

        int pivot = arr[high];
        int i = low-1;

        for(int j = low; j<=high-1;j++){
            if(arr[j]< pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSortCreate(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);

            quickSortCreate(arr, low, pi-1);
            quickSortCreate(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,5,30,3,5,0};
        int n = arr.length;
        
        quickSortCreate(arr, 0, n-1);
        for(int nums : arr){
            System.out.print(nums+" ");
        }
    }

}
