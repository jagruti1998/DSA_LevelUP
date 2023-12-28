package String;

import java.util.Arrays;
import java.util.HashSet;

public class LongestWord_BF {
    public static void main(String[] args)
    {
        String [] s = {"a","banana","app","appl","ap","apply","apple"};
        System.out.println(longestWord(s));
    }


    public static String longestWord(String[] words){
        Arrays.sort(words);
        HashSet<String>set=new HashSet<>();
        String longestWord="";
        for(String word:words){
            if(word.length()==1   || set.contains(word.substring(0, word.length()-1)))
            {
                set.add(word);

                if(word.length()>longestWord.length()){
                    longestWord=word;
                }
            }

        }


        return longestWord;
    }
}
