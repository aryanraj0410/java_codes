package Practice;

public class missingNumber {
    public static int missingElement(int[] arr, int n){
        int expectedSum = n * (n+1)/2;

        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int n = 10;
        int [] arr = {1,2,3,5,6,7,8,9,10};
        System.out.println("Missing number is: " +missingElement(arr, n));
    }
}
