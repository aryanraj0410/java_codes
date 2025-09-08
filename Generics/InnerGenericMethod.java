package Generics;

class Method {
   public static <T> void  printArray(T[] array){
        for(T element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class InnerGenericMethod {
    public static void main(String[] args) {
        Integer[] intArr = {1,3,5,3,2,5};
        String[] strArr = {"Aryan", "Ayush", "Raj"};


        Method.printArray(intArr);
        Method.printArray(strArr);
    }
    
}
