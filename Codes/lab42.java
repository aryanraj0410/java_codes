import java.security.*;
import java.util.Scanner;
import java.util.Base64;

public class lab42 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Step 1: Accept user input
            System.out.print("Enter the message to sign: ");
            String message = scanner.nextLine();

            // Step 2: Generate Key Pair (Public and Private Keys)
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("DSA");
            keyPairGen.initialize(2048); // Set key size
            KeyPair pair = keyPairGen.generateKeyPair();
            PrivateKey privateKey = pair.getPrivate();
            PublicKey publicKey = pair.getPublic();

            // Step 3: Create and Initialize Signature Object for Signing
            Signature signature = Signature.getInstance("SHA256withDSA");
            signature.initSign(privateKey);

            // Step 4: Add data to Signature Object
            signature.update(message.getBytes());

            // Step 5: Generate Digital Signature
            byte[] digitalSignature = signature.sign();
            System.out.println("Generated Digital Signature (Base64 Encoded): " + Base64.getEncoder().encodeToString(digitalSignature));

            // Step 6: Verify the Digital Signature
            Signature verifySig = Signature.getInstance("SHA256withDSA");
            verifySig.initVerify(publicKey);
            verifySig.update(message.getBytes());

            boolean isVerified = verifySig.verify(digitalSignature);
            System.out.println("Signature Verification Result: " + (isVerified ? "Valid" : "Invalid"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
