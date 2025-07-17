 package Sorting;

// public class bubbleSort {
//     public static void main(String[] args) {
        
//         int[] a = {36, 19, 29, 12, 5};
//         int temp;
    
//         for(int i=0; i<a.length;i++){
//             int flag = 0;
//             for(int j=0; j<a.length-1-i; j++){
//                 if(a[j] > a[j+1]){
//                     temp = a[j];
//                     a[j] = a[j+1];
//                     a[j+1] = temp;
//                     flag = 1;
//                 }
//             }
//             if(flag == 0){
//                 break;
//             }
//         }
//         for(int i= 0; i<a.length; i++){
//             System.out.print(a[i]+" ");
//         }
//     }
// }


// ///Sorting of string
// package Sorting;

// public class bubbleSort {
//     public static void main(String[] args) {
        
//         String[] a = {"Ram", "Shaym", "Bharat","Strugan"};
//         String temp;
    
//         for(int i=0; i<a.length;i++){
//             int flag = 0;
//             for(int j=0; j<a.length-1-i; j++){
//                 if(a[j].compareTo(a[j+1]) > 0){
//                     temp = a[j];
//                     a[j] = a[j+1];
//                     a[j+1] = temp;
//                     flag = 1;
//                 }
//             }
//             if(flag == 0){
//                 break;
//             }
//         }
//         for(int i= 0; i<a.length; i++){
//             System.out.print(a[i]+" ");
//         }
//     }
// }


public class bubbleSort{
    public static void main(String[] args) {
        int arr[] = {1,3,63,5,64,6,2};
        int temp;
        for(int i = 0; i<arr.length; i++){
            int flag = 0;
            for(int j =0; j<arr.length-1-i; j++ ){
               temp= arr[j];
                arr[j] = arr[j+1];
               temp= arr[j+1];
            }
            if(flag ==0){
                break;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}