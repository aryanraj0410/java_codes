package Practice;

public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {1,4,2,6,3,46,64,3};
        int n = arr.length;

        int[] rev = new int[n];

        for(int i = 0; i< arr.length;i++){
            rev[i] = arr[n-i-1];
        }
        for(int num : rev)
        System.out.println(num);
    }
}
