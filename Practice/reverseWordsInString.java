package Practice;

public class reverseWordsInString {
    public static void main(String[] args) {
        
    
    String str = "Aryan is a very good boy";

    String[] words = str.split(" ");

    String reversed = "";
    for(int i=words.length-1;i>=0;i--){
        reversed += words[i] + " ";
    }
    System.out.println("String " + str);
    System.out.println("Reversed " + reversed.trim());
    }
}
