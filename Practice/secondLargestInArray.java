package Practice;

public class secondLargestInArray {
    public static void main(String[] args) {
    
    int[] arr = {1,3,5,3,6,220,0,35,36};
    
    int largest  = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for(int num :arr){
        if(num > largest){
            secondLargest = largest;
            largest = num;
        }else if(num > secondLargest && num != largest){
            secondLargest = num;
        }
    }
    System.out.println(secondLargest);
    }

}
