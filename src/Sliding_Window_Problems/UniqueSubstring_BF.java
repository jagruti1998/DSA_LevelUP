package Sliding_Window_Problems;

import java.util.HashSet;
        import java.util.Scanner;
        import java.util.Set;
public class UniqueSubstring_BF {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> uniq = new HashSet<>();
        int i = 0, j = 0, longestSubstringCount = 0;
        while (j < s.length()) {
            if (!uniq.contains(s.charAt(j))) {
                uniq.add(s.charAt(j++));
                longestSubstringCount = Math.max(longestSubstringCount, uniq.size());
            } else {
                uniq.remove(s.charAt(i++));
            }
        }
        return longestSubstringCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        UniqueSubstring_BF us = new UniqueSubstring_BF();
        int length = us.lengthOfLongestSubstring(inputString);

        System.out.println("Length of the longest substring without repeating characters: " + length);

        scanner.close();
    }
}
