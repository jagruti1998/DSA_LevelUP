package BinarySearch;

public class RotatedSearch {

    public static void main(String[] args) {
        RotatedSearch rotatedSearch = new RotatedSearch();

        int[] nums = {4, 5, 6, 7, 0, 1, 2}; // Example rotated sorted array
        int target = 6; // Example target element

        int result = rotatedSearch.search(nums, target);

        if (result != -1) {
            System.out.println("The target element " + target + " is found at index: " + result);
        } else {
            System.out.println("The target element " + target + " is not found in the array.");
        }
    }

    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
