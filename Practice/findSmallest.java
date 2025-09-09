package Practice;

public class findSmallest {
    public static void main(String[] args) {
        int [] arr = {2,63,1,5,6,45,743,1};
        int min_int = arr[0];

        for(int i = 0; i< arr.length; i++){
            if(arr[i] < min_int){
                min_int = arr[i];
            }
        }
        System.out.println(min_int);
    }
}
