package ArraysandVectors;

import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Fizzbuzz_Arraylist {

    public List<String> fizzBuzz(int n) {
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        Fizzbuzz_Arraylist arraylist = new Fizzbuzz_Arraylist();
        List<String> fizzBuzzResult = arraylist.fizzBuzz(n);

        for (String item : fizzBuzzResult) {
            System.out.println(item);
        }
    }
}
