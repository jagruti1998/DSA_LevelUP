package Daily_Challenge;

import java.util.Scanner;

public class PalindromeGenerator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int inputNum= sc.nextInt();

        int result=generatePalindrome(inputNum);

        System.out.println("Palindrome number is:" +result);


        }

        public static int reverseNum(int num){
        int reversed=0;
        while (num>0){
            reversed=reversed*10+num%10;
            num/=10;

        }

        return reversed;
        }

        public static boolean isPalindrome(int num){
        return num==reverseNum(num);
        }




        public static int generatePalindrome(int num){
        while(!isPalindrome(num)){
            int reversed=reverseNum(num);
            num+=reversed;
        }
        return num;
        }
    }

