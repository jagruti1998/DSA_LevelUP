package Sliding_Window_Problems;

import java.util.ArrayList;
import java.util.List;

class ContiguousSegmentsSum_BF {
    public static List<int[]> findSegmentsWithSum(int[] arr, int k) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum == k) {
                    result.add(new int[]{i, j});
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 6;

        List<int[]> segments = findSegmentsWithSum(arr, k);

        if (segments.isEmpty()) {
            System.out.println("No segments with sum " + k + " found.");
        } else {
            System.out.println("Segments with sum " + k + ":");
            for (int[] segment : segments) {
                System.out.println("[" + segment[0] + ", " + segment[1] + "]");
            }
        }
    }
}
