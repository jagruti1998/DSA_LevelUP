package Daily_Challenge;

import java.util.Scanner;

class NumIdenticalPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] nums = new int[length];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        NumIdenticalPairs solution = new NumIdenticalPairs();
        int numIden = solution.numIdenticalPairs(nums);
        System.out.println("Number of Identical Pairs: " + numIden);

        scanner.close();
    }
}
