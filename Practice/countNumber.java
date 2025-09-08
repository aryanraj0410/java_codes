package Practice;

import java.util.*;

public class countNumber {
   public static int countDigit(int n){
    int ctr = 0;
    while(n > 0){
        ctr = ctr +1;
        n = n/10;
    }
    return ctr;
   }

   public static void main(String[] args) {
    int N  = 2348334;
    System.out.println("N:" + N);
    int digits = countDigit(N);
    System.out.println(digits);
   }
}

