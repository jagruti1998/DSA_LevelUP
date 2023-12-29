package String;

import java.util.HashSet;

public class LongestSubstring {
    public static void  main(String[] args){
        String s="abcabca";
        System.out.println(lengthOfLongestSubstring(s));

    }
    public static int lengthOfLongestSubstring(String s){
        HashSet< Character> set=new HashSet<>();

        int left=0,right=0;
        int max=0;

        while(right<s.length()-1)
        {
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                max=Math.max(max,right-left+1);
                right++;
            }

            else
            {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return max;
    }
}
