package Practice;

public class cosonantVowels {
    public static void main(String[] args) {
        String str = "Automation Tech In Field";
        str = str.toLowerCase();
        int vowel = 0 , consonant = 0;

        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <='z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' | ch == 'o' || ch =='u'){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
        }
        System.out.println("Vowels are: "+vowel);
        System.out.println("Consonants are: " +consonant);

    }
}
