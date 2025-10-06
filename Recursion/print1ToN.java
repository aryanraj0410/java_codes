package Recursion;

import java.util.Scanner;

public class print1ToN {
    
    static void oneToN(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i + " ");
        oneToN(i+1, n);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oneToN(1, n);
    }
}
