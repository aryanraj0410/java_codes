//02 | Java Program to Find Maximum Number Out Of Two Numbers
package Practice;

import java.util.*;
public class maxOfTwo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a  = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("First is grearter then second.");
        }else{
            System.out.println("Second is greater then first.");
        }
        sc.close();
    }
}
