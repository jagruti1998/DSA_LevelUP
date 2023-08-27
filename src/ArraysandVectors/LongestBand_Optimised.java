package ArraysandVectors;

import java.util.HashSet;

public class LongestBand_Optimised {

        public int longestConsecutive(int[] nums) {
            HashSet<Integer> hs1 = new HashSet<Integer>();
            for(int num:nums)
            {
                hs1.add(num);
            }
            int longestStreak = 0;
            for(int num1 : nums)
            {
                if(!hs1.contains(num1-1))
                {
                    int currentStreak = 1;
                    int currentNum = num1;
                    while(hs1.contains(currentNum+1))
                    {
                        currentStreak = currentStreak + 1;
                        currentNum = currentNum + 1;
                    }
                    longestStreak = Math.max(longestStreak,currentStreak);
                }
            }
            return longestStreak;

        }


    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int longestLength = LongestBand_Better.longestConsecutive(nums);
        System.out.println("Longest consecutive subsequence length: " + longestLength);
    }
}
