package Practice;

public class lengthOfString {
    public static void main(String[] args) {
        String str = "Aryan raj";

        char[] chars = str.toCharArray();

        int count = 0;
        for(char ch : chars){
            count++;
        }
        System.out.println(count);
    }
}