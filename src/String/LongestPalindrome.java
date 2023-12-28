package String;

import java.util.HashSet;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int len = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                len += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        if (set.size() > 0) {
            return len + 1;
        } else {
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
