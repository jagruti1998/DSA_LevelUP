package String;

import java.util.HashMap;

public class NonRepeatingChars_OPT {
    public static void main(String[] args){
        // Initialize input string
        String s="abcd";
        // Call the method and print the result
        System.out.println(firstNonRepeatingChars(s));
    }


    // Method to find the index of the first non-repeating character
    public static int firstNonRepeatingChars(String s){

// Create a HashMap to store character frequencies
        HashMap<Character,Integer>map=new HashMap<>();

        // First Loop: Populate the map with character frequencies
        for(int i=0;i<s.length();i++){

            // Check if the character is already in the map
            if(map.containsKey(s.charAt(i)))
            {

                // If yes, increment its frequency
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else
            {
                // If not, add the character to the map with frequency 1
                map.put(s.charAt(i),1);
            }
        }

        // Second Loop: Find the first non-repeating character
        for(int i=0;i<s.length();i++){
            // Check the frequency of the character in the map
            if(map.get(s.charAt(i))==1)
            {
                // If frequency is 1, it is the first non-repeating character, return its index
                return i;
            }
        }

        // If no non-repeating character is found, return -1
        return -1;
    }
}
