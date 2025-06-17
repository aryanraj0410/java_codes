package OOPS.JavaCodes;

public class stringToArray {
    public static void main(String[] args) {
        String a = "Aryan raj ";

        char[] b = a.toCharArray();

        for(char i : b){
            System.out.print(i);
        }
    }
}
