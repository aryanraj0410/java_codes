package Practice;

public class TEST {
    public static void main(String[] args) {
        String s = "Aryan is a good boy";
        
        String[] words = s.split(" ");
        for(String arr : words){
            System.out.print(arr+ " ");
        }
        int n = words.length-1;
        System.out.println("Length of last word is: "+ words[n].length());
    }
}
