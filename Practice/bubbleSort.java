package Practice;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {23,53,5,23,6,1};
        int temp;

        for(int i = 0; i<arr.length;i++){
            int flag = 0;
            for(int j = 0;j< arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    // temp = arr[j];
                    // arr[j] = arr[j+1];
                    // arr[j+1] = temp;
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr [j+1];
                    arr[j] = arr[j] -arr[j+1];
                    flag = 1;
                } 
            }
            if(flag ==0){
                break;
            }
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
