package Practice;

public class checkPrime {
    public static void main(String[] args) {
        int n = 12;
        boolean isPrime = true;

        if(n<=1){
            isPrime = false;
        }else{
            for(int i = 2; i<=n/2; i++){
                if(n%i == 0){
                    isPrime = false;
                }
                else{
                    isPrime = true;
                }
            }
        }
        System.out.println(isPrime);
    }
}
