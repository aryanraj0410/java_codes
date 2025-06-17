import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class lab41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string to hash using SHA-1: ");
        String input = scanner.nextLine();
        
        // Compute SHA-1 hash
        String sha1Hash = computeSHA1(input);
        
        // Display the result
        System.out.println("SHA-1 Hash: " + sha1Hash);
        
        scanner.close();
    }

    public static String computeSHA1(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] messageDigest = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            
            // Convert byte array to hexadecimal format
            for (byte b : messageDigest) {
                sb.append(String.format("%02x", b));
            }
            
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-1 Algorithm not found", e);
        }
    }
}