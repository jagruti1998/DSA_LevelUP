package ArraysandVectors;
import java.util.HashMap;

public class LongestBand_Optimised {

    public int longestConsecutive(int[] nums) {

        HashMap<Integer, Boolean> hm = new HashMap<>();

        // first make all the elements true in hashmap
        for(int i = 0; i<nums.length;i++){

            hm.put(nums[i], true);
        }

        //Then, make the elements false where we can find the element before that as they are not the starting point of the sequence.
        for(int val : nums ){
            if(hm.containsKey(val-1)){
                hm.put(val, false);
            }
        }

        int maxStartPoint  = 0;
        int maxLength = 0;

        for(int val: nums){

            if(hm.get(val) == true){

                int length = 1;
                int startingPoint = val;

                while(hm.containsKey(startingPoint + length)){
                    length++;
                }

                if(length> maxLength){
                    maxStartPoint = startingPoint;
                    maxLength = length;

                }

            }

        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int longestLength = LongestBand_Better.longestConsecutive(nums);
        System.out.println("Longest consecutive subsequence length: " + longestLength);
    }
}
