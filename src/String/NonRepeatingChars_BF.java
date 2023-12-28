package String;

public class NonRepeatingChars_BF {    //T(C)=O(n2)  S(C)=0(1)

    public static void main(String[] args){
        String s="mississipi";
        System.out.println(firstUniqueChars(s));
    }


    public static int firstUniqueChars(String s){

        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
            {
                System.out.println("Non repeating char is: " +s.charAt(i));
                return i;
            }
        }

        return -1;
    }
}
