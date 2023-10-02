package BinarySearch;

public class MaximumValuePartition {

    public static boolean divideAmongK(int[] arr, int n, int k, int minCoins) {
        int friends = 0;
        int currentFriend = 0;

        for (int i = 0; i < n; i++) {
            if (currentFriend + arr[i] >= minCoins) {
                friends++;
                currentFriend = 0;
            } else {
                currentFriend += arr[i];
            }
        }

        return friends >= k;
    }

    public static int kPartition(int[] arr, int n, int k) {
        int s = 0;
        int e = 0;
        for (int i = 0; i < n; i++) {
            e += arr[i];
        }
        int ans = 0;

        while (s <= e) {
            int mid = (s + e) / 2;
            boolean isPossible = divideAmongK(arr, n, k, mid);

            if (isPossible) {
                s = mid + 1;
                ans = mid;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int n = a.length;
        int k = 3;

        System.out.println(kPartition(a, n, k));
    }
}
