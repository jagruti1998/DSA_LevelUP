package Sliding_Window_Problems;

public class ContiguousSegmentsSum {
    public static void housing(int[] arr, int n, int k) {
        int i = 0;
        int j = 0;
        int cs = 0;

        while (j < n) {

            // Expand to the right
            cs += arr[j];
            j++;

            // Remove elements from the left until cs > sum and i < j
            while (cs > k && i < j) {
                cs = cs - arr[i];
                i++;
            }

            // Check if the sum matches the target
            if (cs == k) {
                System.out.println(i + " - " + (j - 1));
            }
        }
    }

    public static void main(String[] args) {
        int[] plot = {1, 3, 2, 1, 4, 1, 3, 2, 1, 1};
        int n = plot.length;
        int k = 8;

        System.out.println("Segments with sum " + k + ":");
        housing(plot, n, k);
    }
}
