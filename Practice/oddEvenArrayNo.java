package Practice;

import java.util.ArrayList;

public class oddEvenArrayNo {
    public static void main(String[] args) {
        
    
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};

    ArrayList<Integer> even = new ArrayList<Integer>();
    ArrayList<Integer> odd = new ArrayList<Integer>();

    for(int num : arr)
    if(num % 2 == 0){
        even.add(num);
    }else{
        odd.add(num);
    }

    System.out.println(even);
    System.out.println(odd);
}
}
