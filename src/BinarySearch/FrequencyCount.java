package BinarySearch;
import java.util.Scanner;

    public class FrequencyCount {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            int[] nums = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            System.out.print("Enter the target element: ");
            int target = scanner.nextInt();

            FrequencyCount frequencyCount = new FrequencyCount();
            int[] result = frequencyCount.searchRange(nums, target);

            System.out.println("First occurrence of the target: " + result[0]);
            System.out.println("Last occurrence of the target: " + result[1]);

            scanner.close();
        }

        // Rest of your code (lowerBound, upperBound, searchRange) remains the same


public int[] searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int ans[]=new int[2];
        ans[0]=lowerBound(nums,target);
        ans[1]=upperBound(nums,target);

        return ans;
    }


    // binary search to find the first occurrence of the target
    public int lowerBound(int nums[], int target)
    {
        int s=0;// left index
        int e=nums.length-1;// right index
        int ans=-1;// index of the first occurrence

        while(s<=e)
        {
            int mid=(s+e)/2;// calculate the mid index

            if(nums[mid]==target)
            {
                ans=mid;
                e=mid-1;
            }

            else if(nums[mid]>target)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return ans;
    }


    // binary search to find the last occurrence of the target

    public int upperBound(int nums[], int target)
    {
        int s=0;// left index
        int e=nums.length-1;// right index
        int ans=-1;// index of the last occurrence

        while(s<=e)
        {
            int mid=(s+e)/2;// calculate the mid index

            if(nums[mid]==target)
            {
                ans=mid;// update index of the last occurrence
                s=mid+1;// search in the right half
            }

            else if(nums[mid]>target)
            {
                e=mid-1;// search in the left half
            }
            else
            {
                s=mid+1;// search in the right half
            }
        }
        return ans;
    }

}