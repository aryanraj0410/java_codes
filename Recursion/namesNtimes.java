package Recursion;

import java.util.*;

public class namesNtimes {

    static void printNames(int i, int n){
        if(i > n){
            return;
        }
        System.out.println("aryan");
        printNames(i + 1, n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        printNames(1, n);      
    }
}
