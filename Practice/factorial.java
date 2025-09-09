package Practice;

public class factorial {
    public static void main(String[] args) {
    int n = 15;

    //loop method 
    int factorial1 = 1;
        for(int i=1; i<=n; i++){
            factorial1 *= i;
        }

    //Recurcion
    int factorial2 = factorialRecursion(n);
    System.out.println("By loop: " +factorial1);
    System.out.println("By recursion: " +factorial2);
    }

    public static int factorialRecursion(int n){
        if(n ==0 || n==1){
            return 1;
        }
        return n*factorialRecursion(n-1);
    }
}
