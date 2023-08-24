package ArraysandVectors;

public class longestMountain {

    public int longestMountain(int[] arr) {
        int n = arr.length;
        int largest = 0;

        for (int i = 1; i <= n - 2;) {  //time complexity is O(n)  || space complexity is O(1):
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int count = 1;
                int j = i;

                // Count left mountain elements
                while (j >= 1 && arr[j] > arr[j - 1]) {
                    j--;
                    count++;
                }

                // Count right mountain elements
                while (i <= n - 2 && arr[i] > arr[i + 1]) {
                    i++;
                    count++;
                }

                largest = Math.max(largest, count);
            } else {
                i++;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        // Create an example input array
        int[] arr = { 5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4 };

        // Create an instance of the class that contains the longestMountain method
        longestMountain lm = new longestMountain(); // Replace YourClassName with the actual name of your class

        // Call the longestMountain method and store the result
        int result = lm.longestMountain(arr);

        // Print the result
        System.out.println("Length of the longest mountain: " + result);
    }

}
