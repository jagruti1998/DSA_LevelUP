package String;

import java.util.Arrays;
import java.util.HashSet;

public class LongestWord_BF {
    public static void main(String[] args)
    {
        // Input array of words
        String [] s = {"a","banana","app","appl","ap","apply","apple"};
        // Call the method and print the result
        System.out.println(longestWord(s));
    }

    // Method to find the longest word that can be constructed from other words
    public static String longestWord(String[] words){
        // Sort the array of words in lexicographical order
        Arrays.sort(words);

        // HashSet to store unique prefixes
        HashSet<String>set=new HashSet<>();

        // Variable to store the longest word
        String longestWord="";

        // Iterate through each word in the sorted array
        for(String word:words){

            // Check if the word has a length of 1 or its prefix is in the HashSet
            if(word.length()==1   || set.contains(word.substring(0, word.length()-1)))
            {
                // Add the word to the HashSet
                set.add(word);

                // Update the longest word if the current word is longer
                if(word.length()>longestWord.length()){
                    longestWord=word;
                }
            }

        }

        // Return the longest word
        return longestWord;
    }
}
