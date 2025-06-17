package OOPS.JavaCodes;

public class reverseString {
    public static void main(String[] args) {
        String origaString = "Aryan raj";
        String reString = " ";

        for(int i=0; i< origaString.length(); i++){
            reString = origaString.charAt(i) + reString;
        }
        System.out.println(reString);
    }
}
