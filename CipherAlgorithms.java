//ADARSH PRAKASH
//21BCE3331
import java.util.Scanner;

public class CipherAlgorithms {

    // Caesar Cipher
    public static String caesarEncrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        shift = shift % 26;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + shift) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String caesarDecrypt(String text, int shift) {
        return caesarEncrypt(text, 26 - shift % 26);
    }

    // Playfair Cipher
    public static String playfairEncrypt(String text, String key) {
        text = text.replaceAll("[^a-zA-Z]", "").toUpperCase().replace('J', 'I');
        key = key.toUpperCase();
        char[][] matrix = createPlayfairMatrix(key);
        StringBuilder result = new StringBuilder();

        text = preprocessPlayfairText(text);

        for (int i = 0; i < text.length(); i += 2) {
            char a = text.charAt(i);
            char b = text.charAt(i + 1);
            int[] posA = findPosition(matrix, a);
            int[] posB = findPosition(matrix, b);

            if (posA[0] == posB[0]) { // Same row
                result.append(matrix[posA[0]][(posA[1] + 1) % 5])
                        .append(matrix[posB[0]][(posB[1] + 1) % 5]);
            } else if (posA[1] == posB[1]) { // Same column
                result.append(matrix[(posA[0] + 1) % 5][posA[1]])
                        .append(matrix[(posB[0] + 1) % 5][posB[1]]);
            } else { // Rectangle swap
                result.append(matrix[posA[0]][posB[1]])
                        .append(matrix[posB[0]][posA[1]]);
            }
        }
        return result.toString();
    }

    private static char[][] createPlayfairMatrix(String key) {
        StringBuilder sb = new StringBuilder();
        boolean[] used = new boolean[26];
        key = key.replace('J', 'I');
        for (char c : key.toCharArray()) {
            if (!used[c - 'A']) {
                sb.append(c);
                used[c - 'A'] = true;
            }
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            if (c != 'J' && !used[c - 'A']) {
                sb.append(c);
            }
        }
        char[][] matrix = new char[5][5];
        for (int i = 0; i < 25; i++) {
            matrix[i / 5][i % 5] = sb.charAt(i);
        }
        return matrix;
    }

    private static String preprocessPlayfairText(String text) {
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length() - 1; i += 2) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.insert(i + 1, 'X');
            }
        }
        if (sb.length() % 2 != 0) {
            sb.append('X');
        }
        return sb.toString();
    }

    private static int[] findPosition(char[][] matrix, char c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == c) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // Vigenère Cipher
    public static String vigenereEncrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + (key.charAt(j) - 'A')) % 26 + base));
                j = (j + 1) % key.length();
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String vigenereDecrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base - (key.charAt(j) - 'A') + 26) % 26 + base));
                j = (j + 1) % key.length();
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Hill Cipher (Encryption only for simplicity)
    public static String hillEncrypt(String text, int[][] keyMatrix) {
        text = text.toUpperCase().replaceAll("[^A-Z]", "");
        int n = keyMatrix.length;
        while (text.length() % n != 0) {
            text += 'X'; // Padding
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i += n) {
            int[] vector = new int[n];
            for (int j = 0; j < n; j++) {
                vector[j] = text.charAt(i + j) - 'A';
            }

            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += keyMatrix[j][k] * vector[k];
                }
                result.append((char) ((sum % 26) + 'A'));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an algorithm:\n1. Caesar Cipher\n2. Playfair Cipher\n3. Vigenère Cipher\n4. Hill Cipher");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.println("Enter text:");
                String caesarText = scanner.nextLine();
                System.out.println("Enter shift:");
                int shift = scanner.nextInt();
                System.out.println("Encrypted: " + caesarEncrypt(caesarText, shift));
                System.out.println("Decrypted: " + caesarDecrypt(caesarText, shift));
                break;

            case 2:
                System.out.println("Enter text:");
                String playfairText = scanner.nextLine();
                System.out.println("Enter key:");
                String playfairKey = scanner.nextLine();
                System.out.println("Encrypted: " + playfairEncrypt(playfairText, playfairKey));
                break;

            case 3:
                System.out.println("Enter text:");
                String vigenereText = scanner.nextLine();
                System.out.println("Enter key:");
                String vigenereKey = scanner.nextLine();
                System.out.println("Encrypted: " + vigenereEncrypt(vigenereText, vigenereKey));
                System.out.println("Decrypted: " + vigenereDecrypt(vigenereText, vigenereKey));
                break;

            case 4:
                System.out.println("Enter text:");
                String hillText = scanner.nextLine();
                System.out.println("Enter matrix size (n):");
                int n = scanner.nextInt();
                int[][] keyMatrix = new int[n][n];
                System.out.println("Enter key matrix:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        keyMatrix[i][j] = scanner.nextInt();
                    }
                }
                System.out.println("Encrypted: " + hillEncrypt(hillText, keyMatrix));
                break;

            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
