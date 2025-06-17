import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class lab2 {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Plain Text for DES: ");
        String plainText = scanner.nextLine();
        System.out.print("Enter Key for DES (8 characters): ");
        String keyInput = scanner.nextLine();
        
        if (keyInput.length() != 8) {
            System.out.println("Invalid key length. DES requires 8 characters.");
            return;
        }
        
        SecretKeySpec key = new SecretKeySpec(keyInput.getBytes(), "DES");
        
        System.out.println("\n=== Encryption Process ===");
        System.out.println("Plain Text: " + plainText);
        String cipherText = encrypt(plainText, key);
        System.out.println("Cipher Text: " + cipherText);
        
        System.out.println("\n=== Decryption Process ===");
        String decryptedText = decrypt(cipherText, key);
        System.out.println("Decrypted Text: " + decryptedText);
    }
    
    public static String encrypt(String plainText, SecretKeySpec key) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
    
    public static String decrypt(String cipherText, SecretKeySpec key) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(cipherText));
        return new String(decryptedBytes);
    }
}