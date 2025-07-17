package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        // int[] arr = {3,5,6,1,6,2,7,4,7,3,6};
        // int item = 2;
        // int temp = 0;

        // for(int i=0; i<arr.length;i++){
        //     if(arr[i]==item){
        //         System.out.println("Item found at "+i+" index position");
        //         temp = temp+1;
        //     }
        // }
        // if(temp == 0){
        //     System.out.println("Item not found.");
        // }

        String[] arr = {"Aryan", "Ayush", "Ram", "Shayam", "Sita"};
        String item = "Ram";
        int temp = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(item)){
                System.out.println("Item found at "+i+" index position");
                temp = temp+1;
            }
        }
        if(temp == 0){
            System.out.println("Item not foound.");
        }
    }
}


