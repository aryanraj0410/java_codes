import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

class lab22 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Plain Text for AES: ");
        String plainText = scanner.nextLine();
        System.out.print("Enter Key for AES (16 characters): ");
        String keyInput = scanner.nextLine();
        
        if (keyInput.length() != 16) {
            System.out.println("Invalid key length. AES requires 16 characters.");
            return;
        }
        
        SecretKeySpec key = new SecretKeySpec(keyInput.getBytes(), "AES");
        
        System.out.println("\n=== Encryption Process ===");
        System.out.println("Plain Text: " + plainText);
        String cipherText = encrypt(plainText, key);
        System.out.println("Cipher Text: " + cipherText);
        
        System.out.println("\n=== Decryption Process ===");
        String decryptedText = decrypt(cipherText, key);
        System.out.println("Decrypted Text: " + decryptedText);
    }
    
    
    public static String encrypt(String plainText, SecretKeySpec key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
    

    public static String decrypt(String cipherText, SecretKeySpec key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(cipherText));
        return new String(decryptedBytes);
    }
}