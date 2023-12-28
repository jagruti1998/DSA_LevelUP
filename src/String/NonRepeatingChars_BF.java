package String;

public class NonRepeatingChars_BF {   // Time Complexity: O(n^2) (due to nested indexOf and lastIndexOf)
                                     // Space Complexity: O(1) (constant space)
    public static void main(String[] args){
        String s="mississipi";
        // Call the method and print the result
        System.out.println(firstUniqueChars(s));
    }


    // Method to find the index of the first non-repeating character using a brute-force approach
    public static int firstUniqueChars(String s){

        // Iterate through each character in the string
        for(int i=0;i<s.length();i++){
            // Check if the first occurrence index is equal to the last occurrence index
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
            {
                // If true, the character is non-repeating
                System.out.println("Non repeating char is: " +s.charAt(i));
                // Return the index of the non-repeating character
                return i;
            }
        }
        // If no non-repeating character is found, return -1
        return -1;
    }
}
