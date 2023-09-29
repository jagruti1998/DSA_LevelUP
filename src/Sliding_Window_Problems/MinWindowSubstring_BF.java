package Sliding_Window_Problems;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MinWindowSubstring_BF {
     public String minWindow(String s, String t) {
            if(s.length()==0 || t.length()==0 || s.length()<t.length()){
                return new String();
            }
            int[] map = new int[128];
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();

            for(char i : tArray){
                map[i]++;
            }
            int left = 0;
            int right=0;
            int count = t.length();
            int minStart = 0;
            int minLength=Integer.MAX_VALUE;

            while(right<s.length()){
                if(map[sArray[right]] >0){
                    count--;
                }
                map[sArray[right]]--;

                while(count==0){
                    if(right-left+1 < minLength){
                        minLength = right-left+1;
                        minStart = left;
                    }
                    map[sArray[left]]++;
                    if(map[sArray[left]] > 0){
                        count++;
                    }
                    left++;
                }
                right++;
            }
            if(minLength>s.length()){
                return new String();
            }else{
                return s.substring(minStart, minStart+minLength);
            }

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
