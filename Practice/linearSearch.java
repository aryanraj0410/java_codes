package Practice;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {4,4,6,1,4,6,3,643,0};
        int target = 643;
        int temp = 0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Item present at: "+ i);
                temp = temp+1;
            }
        }
        if(temp==0){
            System.out.println("Item not found.");
        }
    }
}
