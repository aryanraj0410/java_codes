import java.math.BigInteger;
import java.util.Scanner;

public class lab32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a prime number (p): ");
        BigInteger p = sc.nextBigInteger();

        System.out.print("Enter a primitive root modulo p (a): ");
        BigInteger a = sc.nextBigInteger();

        System.out.print("Enter private key of User A: ");
        BigInteger privateKeyA = sc.nextBigInteger();

        System.out.print("Enter private key of User B: ");
        BigInteger privateKeyB = sc.nextBigInteger();

        BigInteger publicKeyA = a.modPow(privateKeyA, p);
        BigInteger publicKeyB = a.modPow(privateKeyB, p);

        System.out.println("Public Key of User A: " + publicKeyA);
        System.out.println("Public Key of User B: " + publicKeyB);

        BigInteger sharedSecretA = publicKeyB.modPow(privateKeyA, p);
        BigInteger sharedSecretB = publicKeyA.modPow(privateKeyB, p);

        System.out.println("Shared Secret Key computed by User A: " + sharedSecretA);
        System.out.println("Shared Secret Key computed by User B: " + sharedSecretB);
    }
}
