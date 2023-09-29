package Sliding_Window_Problems;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MinWindowSubstring_BF {

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        int count = 0, start = 0, min_length = Integer.MAX_VALUE, min_start = 0;
        for (int end = 0; end < s.length(); end++) {
            if (map.containsKey(s.charAt(end))) {
                if (map.get(s.charAt(end)) > 0) {
                    count++;
                }
                map.put(s.charAt(end), map.get(s.charAt(end)) - 1);
            }
            if (count == t.length()) {
                while (start < end && (!map.containsKey(s.charAt(start)) || map.get(s.charAt(start)) < 0)) {
                    if (map.containsKey(s.charAt(start))) {
                        map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
                    }
                    start++;
                }
                if (min_length > end - start + 1) {
                    min_length = end - (min_start = start) + 1;
                }
                if (map.containsKey(s.charAt(start))) {
                    map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
                }
                count--;
                start++;
            }
        }
        return min_length == Integer.MAX_VALUE ? "" : s.substring(min_start, min_start + min_length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string S: ");
        String s = scanner.nextLine();
        System.out.println("Enter the string T: ");
        String t = scanner.nextLine();

        MinWindowSubstring_BF minwin = new MinWindowSubstring_BF();
        String result = minwin.minWindow(s, t);

        System.out.println("Minimum Window Substring: " + result);

        scanner.close();
    }
}
