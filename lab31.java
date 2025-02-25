import java.math.BigInteger;
import java.util.Scanner;

public class lab31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first prime number (p): ");
        BigInteger p = sc.nextBigInteger();

        System.out.print("Enter second prime number (q): ");
        BigInteger q = sc.nextBigInteger();

        BigInteger n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));

        System.out.print("Enter public key exponent (e): ");
        BigInteger e = sc.nextBigInteger();

        while (!phi.gcd(e).equals(BigInteger.ONE)) {
            System.out.println("e is not coprime with φ(n). Enter another value for e: ");
            e = sc.nextBigInteger();
        }

        BigInteger d = e.modInverse(phi);

        System.out.println("Public Key: (" + e + ", " + n + ")");
        System.out.println("Private Key: (" + d + ", " + n + ")");

        System.out.print("Enter message to encrypt: ");
        BigInteger message = sc.nextBigInteger();

        BigInteger encrypted = message.modPow(e, n);
        System.out.println("Encrypted Message: " + encrypted);

        BigInteger decrypted = encrypted.modPow(d, n);
        System.out.println("Decrypted Message: " + decrypted);
    }
}

