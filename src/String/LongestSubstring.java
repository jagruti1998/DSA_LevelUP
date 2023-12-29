package String;

import java.util.HashSet;

public class LongestSubstring {
    public static void  main(String[] args){
        String s="abcabca";
        System.out.println(lengthOfLongestSubstring(s));

    }
    public static int lengthOfLongestSubstring(String s){
        //HashSet to store unique characters
        HashSet< Character> set=new HashSet<>();

        int left=0,right=0;
        int max=0;

        while(right<s.length()-1)
        {

            if(!set.contains(s.charAt(right))){
                //if character at right not in set , add to set
                set.add(s.charAt(right));
                //update max size if needed
                max=Math.max(max,right-left+1);
                //move right to next pointer
                right++;
            }

            else
            {
                //if character of right already in set, remove character at left
                set.remove(s.charAt(left));
                // Move 'left' pointer to the next position
                left++;
            }
        }
        // Return the length of the longest substring without repeating characters
        return max;
    }
}
