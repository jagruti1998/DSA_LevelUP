package ArraysandVectors;

import java.util.HashMap;
import java.util.Map;


public class TwoSum_HashMap {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

            public static int[] twoSum(int[] nums, int target) {   //T(C)-O(N)  S(C)-O(N)
                Map<Integer, Integer> map = new HashMap<>();
                int n = nums.length;

                for (int i = 0; i < nums.length; i++) {
                    if (map.containsKey(target - nums[i])) {
                        return new int[] {map.get(target - nums[i]), i};
                    }
                    map.put(nums[i], i);
                }
                return null;
            }
        }
