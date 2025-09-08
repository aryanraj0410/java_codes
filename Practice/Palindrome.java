package Practice;

import java.util.*;


public class Palindrome{
    public static boolean noPalindrome(int n){
        int revNum = 0;
        int dup = n;

        while(n>0){
            int ld = n % 10;
            revNum  = (revNum * 10)  + ld;
            n = n/10;
        }
        if(dup == revNum){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int N = 121;
        if(noPalindrome(N)){
            System.out.println(N +"Number is Palindrome");
        }
        else{
            System.out.println("Number is not Plaindrome");
        }
    }
}