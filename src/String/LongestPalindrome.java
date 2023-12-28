package String;

import java.util.HashSet;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        // HashSet to store characters encountered
        HashSet<Character> set = new HashSet<>();

        // Variable to track the length of the palindrome
        int len = 0;

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {

            // Check if the character is already in the HashSet
            if (set.contains(c)) {

                // If yes, it forms a pair for an even-length palindrome
                len += 2;
                set.remove(c); // Remove the character from the HashSet
            } else {

                // If not, add the character to the HashSet
                set.add(c);
            }
        }

        // Check if there are characters left in the HashSet
        if (set.size() > 0) {

            // If yes, there are characters that can be the center of an odd-length palindrome
            return len + 1;
        } else {

            // If no characters left, return the length of the palindrome
            return len;
        }
    }

    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();
        String inputString = "abccccdd";
        int result = lp.longestPalindrome(inputString);
        System.out.println("Length of the longest palindrome: " + result);
    }
}
