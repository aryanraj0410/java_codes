package Practice;

public class stringPalindrome {
    public static void main(String[] args) {
        String str = "madam";

        boolean isPalindorme = true;

        for(int i = 0; i<str.length()-i-1; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                isPalindorme = false;
                break;
            }else{
                isPalindorme = true;
            }
        }
        System.out.println(isPalindorme);
    }
}
