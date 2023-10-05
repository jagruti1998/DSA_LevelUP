package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public void permutations(List<Integer> nums, List<List<Integer>> ans, List<Integer> ds, int[] freq) {
        if (ds.size() == nums.size()) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.size(); i++) {
            if (freq[i] == 0) {
                ds.add(nums.get(i));
                freq[i]++;
                permutations(nums, ans, ds, freq);
                freq[i]--;
                ds.remove(ds.size() - 1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int[] freq = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            freq[i] = 0;
        }
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }
        permutations(numsList, ans, ds, freq);
        return ans;
    }

    public static void main(String[] args) {
        Permutations solution = new Permutations();
        int[] nums = {1, 2, 3}; // Change this to your desired input array

        List<List<Integer>> permutations = solution.permute(nums);

        // Print the permutations
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
