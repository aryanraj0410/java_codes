import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class lab34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name to hash using MD5: ");
        String inputName = sc.nextLine();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(inputName.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            System.out.println("MD5 Hash of \"" + inputName + "\": " + hexString.toString());
            
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error: MD5 algorithm not found.");
            e.printStackTrace();
        }
    }
}

