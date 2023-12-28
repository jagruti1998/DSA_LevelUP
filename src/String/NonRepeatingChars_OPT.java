package String;

import java.util.HashMap;

public class NonRepeatingChars_OPT {
    public static void main(String[] args){
        String s="abcd";
        System.out.println(firstNonRepeatingChars(s));
    }



    public static int firstNonRepeatingChars(String s){

        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1)
            {
                return i;
            }
        }

        return -1;
    }
}
