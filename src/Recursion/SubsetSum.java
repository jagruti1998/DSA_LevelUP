package Recursion;
public class SubsetSum {

    public static int subsetSum(int[] arr, int X) {
        int n = arr.length;
        return countSubSet(arr, 0, X);
    }

    private static int countSubSet(int[] arr, int i, int X) {
        int n = arr.length;

        if (i == n) {
            if (X == 0) {
                return 1;
            }
            return 0;
        }

        int inc = countSubSet(arr, i + 1, X - arr[i]);
        int exc = countSubSet(arr, i + 1, X);

        return inc + exc;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int X = 10;
        int result = subsetSum(arr, X);
        System.out.println(result);
    }
}
