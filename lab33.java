import java.math.BigInteger;
import java.util.Scanner;

public class lab33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a prime number (p): ");
        BigInteger p = sc.nextBigInteger();

        System.out.print("Enter a primitive root modulo p (a): ");
        BigInteger a = sc.nextBigInteger();

        System.out.print("Enter private key of User A: ");
        BigInteger privateKeyA = sc.nextBigInteger();

        System.out.print("Enter message to encrypt: ");
        BigInteger message = sc.nextBigInteger();

        System.out.print("Enter random integer k: ");
        BigInteger k = sc.nextBigInteger();

        BigInteger publicKeyA = a.modPow(privateKeyA, p);

        // Encryption
        BigInteger r = a.modPow(k, p);
        BigInteger c1 = message.multiply(publicKeyA.modPow(k, p)).mod(p);

        System.out.println("Ciphertext: (" + r + ", " + c1 + ")");

        // Decryption
        BigInteger decryptedMessage = c1.multiply(r.modPow(p.subtract(BigInteger.ONE).subtract(privateKeyA), p)).mod(p);
        
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
}
