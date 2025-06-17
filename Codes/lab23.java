import java.util.Scanner;

class Main {
    private byte[] S = new byte[256];
    private int i = 0, j = 0;

    public Main(byte[] key) {
        keySchedulingAlgorithm(key);
    }

    private void keySchedulingAlgorithm(byte[] key) {
        for (int i = 0; i < 256; i++) {
            S[i] = (byte) i;
        }
        
        int j = 0;
        for (int i = 0; i < 256; i++) {
            j = (j + S[i] + key[i % key.length]) & 0xFF;
            swap(i, j);
        }
    }

    public byte[] encryptDecrypt(byte[] input) {
        byte[] output = new byte[input.length];
        for (int k = 0; k < input.length; k++) {
            i = (i + 1) & 0xFF;
            j = (j + S[i]) & 0xFF;
            swap(i, j);
            output[k] = (byte) (input[k] ^ S[(S[i] + S[j]) & 0xFF]);
        }
        return output;
    }

    private void swap(int a, int b) {
        byte temp = S[a];
        S[a] = S[b];
        S[b] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Plain Text for RC4: ");
        String plainText = scanner.nextLine();
        System.out.print("Enter Key for RC4: ");
        String keyInput = scanner.nextLine();
        
        byte[] key = keyInput.getBytes();
        Main rc4 = new Main(key);

        byte[] cipherText = rc4.encryptDecrypt(plainText.getBytes());
        System.out.println("Cipher Text: " + new String(cipherText));

        Main rc4Decrypt = new Main(key);
        byte[] decryptedText = rc4Decrypt.encryptDecrypt(cipherText);
        System.out.println("Decrypted Text: " + new String(decryptedText));
    }
}