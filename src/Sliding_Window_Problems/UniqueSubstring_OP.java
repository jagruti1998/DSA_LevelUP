package Sliding_Window_Problems;

import java.util.HashMap;
        import java.util.Scanner;


public class UniqueSubstring_OP {
        public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (mpp.containsKey(s.charAt(right))) {
                left = Math.max(mpp.get(s.charAt(right)) + 1, left);
            }
            mpp.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        UniqueSubstring_OP us = new UniqueSubstring_OP();
        int length = us.lengthOfLongestSubstring(inputString);

        System.out.println("Length of the longest substring without repeating characters: " + length);

        scanner.close();
    }
}
