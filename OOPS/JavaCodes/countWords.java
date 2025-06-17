package OOPS.JavaCodes;


public class countWords {
    public static void main(String[] args) {
        String a = "Aryan raj is a good boy";

        int countWords = a.split("\\s").length;
        System.out.println(countWords);
    }
}
