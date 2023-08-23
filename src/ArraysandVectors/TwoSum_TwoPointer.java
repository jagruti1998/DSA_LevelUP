package ArraysandVectors;
import java.util.Arrays;

public class TwoSum_TwoPointer {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};//nums is initialized with [2, 7, 11, 15].
        int target = 9;//target is set to 9.

        int[] result = twoSum(nums, target);//We call the twoSum function with nums and target:
        //The main method assigns this result to result.

        for (int num : result) {//iterates through the elements of result and prints them.
            System.out.print(num + " ");
        }
    }



    public static int[] twoSum(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] { -1, -1 }; // No solution found
    }
}
