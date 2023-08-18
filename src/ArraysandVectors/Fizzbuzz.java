package ArraysandVectors;

import java.util.Scanner;
import java.util.Vector;

    public class Fizzbuzz {

        public static Vector<String> fizzbuzz(int n){

            Vector<String> result =new Vector<>();
            for(int i=1;i<=n;i++){
                if((i%15)==0){
                    result.add("FizzBuzz");
                }
                else if(i%5 == 0){
                    result.add("Buzz");
                }
                else if(i%3 == 0){
                    result.add("Fizz");
                }
                else{
                    result.add(i+"");
                }

            }

            return result;

        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();

            Vector<String> fizzbuzzResult = fizzbuzz(n);

            for (String item : fizzbuzzResult) {
                System.out.println(item);
            }
        }


    }
