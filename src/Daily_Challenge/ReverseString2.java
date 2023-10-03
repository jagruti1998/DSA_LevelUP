package Daily_Challenge;

import java.util.Scanner;

public class ReverseString2 {
    static void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static String reverseStr(String s, int k) {
        int i = 0;
        int n = s.length();
        char[] arr = s.toCharArray();
        while (i < n) {
            int j = Math.min(i + k - 1, n - 1);
            reverse(arr, i, j);
            i = i + 2 * k;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.print("Enter chunk size (k): ");
        int k = scanner.nextInt();

        String reversedString = reverseStr(s, k);
        System.out.println("Reversed String: " + reversedString);

        scanner.close();
    }
}
