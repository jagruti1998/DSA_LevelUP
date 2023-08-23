package ArraysandVectors;
import java.util.*;

public class Triplet_BruteForce {
public List<List<Integer>> threeSum(int[] num) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(num);

        for (int i = 0; i < num.length - 2; i++) {
            int left = i + 1;
            int right = num.length - 1;
            int target = -num[i];

            while (left < right) {
                int sum = num[left] + num[right];

                if (sum == target) {
                    result.add(Arrays.asList(num[i], num[left], num[right]));
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return new ArrayList<>(result);
    }
 
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Triplet_BruteForce tripletBt = new Triplet_BruteForce();
        List<List<Integer>> result = tripletBt.threeSum(nums);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
