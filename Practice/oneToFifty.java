//14 | Java Program To Print Numbers From 1 to 50 Which is Divisible By 5 or 3
package Practice;
public class oneToFifty {
    public static void main(String[] args) {
        int n=50;

        for(int i=0; i<=n; i++){
            if(i%5 == 0 || i%3 == 0){
                    System.out.print(i + " ");
            }

        }
    }
}
