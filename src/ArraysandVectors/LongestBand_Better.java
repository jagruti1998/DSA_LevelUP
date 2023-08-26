package ArraysandVectors;
import java.util.Arrays;
//better approach
public class LongestBand_Better {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        Arrays.sort(nums); // Sort the array in ascending order
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < nums.length; i++) { // Start from the second element
            if (nums[i] == nums[i - 1]) {
                // Skip duplicate elements
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                // If the current number is one greater than the previous, increment count
                count++;
            } else {
                // If not consecutive, reset count to 1
                count = 1;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

        public static void main(String[] args) {
            int[] nums = {100, 4, 200, 1, 3, 2};
            int longestLength = LongestBand_Better.longestConsecutive(nums);
            System.out.println("Longest consecutive subsequence length: " + longestLength);
        }
    }


