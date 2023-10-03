package Daily_Challenge;

public class ReverseWordsInString {

    public String reverseWords(String s) {
        char arr []=s.toCharArray();
        int start=0;
        int end=0;

        while(start<arr.length){
            while(end<arr.length && arr[end]!=' '){
                end++;
            }

            reverse(start, end-1, arr);
            start=end+1;
            end=start;
        }
        return new String(arr);
    }
    private void reverse(int l , int r, char arr[]){
        while(l<r){
            char temp=arr[l];
            arr[l++]=arr[r];
            arr[r--]=temp;
        }
    }

    public static void main(String[] args) {
            ReverseWordsInString rev = new ReverseWordsInString();
            String input = "Let's take LeetCode contest";
            String reversed = rev.reverseWords(input);
            System.out.println(reversed);
        }
    }

