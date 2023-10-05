package Recursion;
import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public List<String> findPermutations(String input) {
        List<String> result = new ArrayList<>();
        char[] chars = input.toCharArray();
        permute(chars, 0, result);
        return result;
    }

    private void permute(char[] chars, int currentIndex, List<String> result) {
        if (currentIndex == chars.length - 1) {
            result.add(new String(chars));
            return;
        }

        for (int i = currentIndex; i < chars.length; i++) {
            // Swap the current character with the character at index i
            char temp = chars[currentIndex];
            chars[currentIndex] = chars[i];
            chars[i] = temp;

            // Recursively generate permutations for the remaining characters
            permute(chars, currentIndex + 1, result);

            // Backtrack by restoring the original order
            temp = chars[currentIndex];
            chars[currentIndex] = chars[i];
            chars[i] = temp;
        }
    }

    public static void main(String[] args) {
        Permutations stringPermutations = new Permutations();
        String input = "abc"; // Change this to your desired input string
        List<String> permutations = stringPermutations.findPermutations(input);

        // Print the permutations
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
