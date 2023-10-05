package Recursion;
import java.util.*;

public class PhoneKeypad {

    static String[] keypad = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

    public static void printKeypadOutput(String input, String output, int i) {
        if (i == input.length()) {
            System.out.println(output);
            return;
        }

        // Recursive case
        int currentDigit = input.charAt(i) - '0';
        if (currentDigit == 0 || currentDigit == 1) {
            printKeypadOutput(input, output, i + 1);
            return;
        }

        // Keypad
        for (int k = 0; k < keypad[currentDigit].length(); k++) {
            char currentChar = keypad[currentDigit].charAt(k);
            printKeypadOutput(input, output + currentChar, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        printKeypadOutput(input, output, 0);
    }
}
