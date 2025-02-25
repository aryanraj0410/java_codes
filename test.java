// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
import java.lang.Math;

class test {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int num=1534236469;
        System.out.println(reverse(num));
    }
    public static int reverse(int number) {
        long reverse = 0; 

        while(number != 0)   
        {  
            long remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10;  
            
        }  
        if(reverse <=-Math.pow(2,31) || reverse >= Math.pow(2,31)-1){
            return 0;
        }
        else{
            int ans=(int)reverse;
            return ans;
        }
    }  
}