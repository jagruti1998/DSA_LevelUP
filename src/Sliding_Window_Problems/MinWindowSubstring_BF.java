package Sliding_Window_Problems;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring_BF {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }

        // Create frequency maps for characters in t and the current window
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;
        int count = 0;

        while (right < s.length()) {
            char charRight = s.charAt(right);
            windowMap.put(charRight, windowMap.getOrDefault(charRight, 0) + 1);

            // If the current character is part of t and its count in window is equal to or greater than tMap
            if (tMap.containsKey(charRight) && windowMap.get(charRight) <= tMap.get(charRight)) {
                count++;
            }

            // Try to minimize the window by moving left pointer
            while (count == t.length()) {
                // Update the minimum window
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minStart = left;
                }

                char charLeft = s.charAt(left);
                windowMap.put(charLeft, windowMap.get(charLeft) - 1);

                // If the character being removed is part of t and its count becomes less than required, decrement count
                if (tMap.containsKey(charLeft) && windowMap.get(charLeft) < tMap.get(charLeft)) {
                    count--;
                }

                left++; // Shrink the window from the left
            }

            right++; // Expand the window from the right
        }

        // Check if a valid window was found
        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        // Return the minimum window substring
        return s.substring(minStart, minStart + minLength);
    }

    public static void main(String[] args) {
        MinWindowSubstring_BF solution = new MinWindowSubstring_BF();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = solution.minWindow(s, t);
        System.out.println(result); // Output: "BANC"
    }
}
