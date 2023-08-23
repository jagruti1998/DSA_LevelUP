package ArraysandVectors;

public class TwoSum_Bruteforce {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};//nums is initialized with [2, 7, 11, 15].
        int target = 9;//target is set to 9.

        int[] result = twoSum(nums, target);//We call the twoSum function with nums and target:
        //The main method assigns this result to result.

        for (int num : result) {//iterates through the elements of result and prints them.
            System.out.print(num + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {  //T(C)- O(N2)  S(C)-O(1)
        for (int i = 0; i < nums.length; i++) {  //i will take values 0, 1, 2, and 3
            for (int j = i + 1; j < nums.length; j++) {//j will take values 1, 2, 3, and 4
                if (nums[i] + nums[j] == target) { //the code checks if nums[i] + nums[j] equals the target value (9).

                    return new int[] {i, j};//First iteration (i = 0, j = 1): nums[0] + nums[1] = 2 + 7 = 9 (equals target), so it returns [0, 1].
                }
            }
        }
        return null;//it means that no solution was found.
    }
}
