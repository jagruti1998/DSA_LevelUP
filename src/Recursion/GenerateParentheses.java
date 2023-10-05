package Recursion;

import java.util.ArrayList;
        import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int N) {
        List<String> result = new ArrayList<>();
        generate(result, "", N, 0, 0);
        return result;
    }

    private void generate(List<String> result, String current, int N, int open, int close) {
        if (current.length() == 2 * N) {
            result.add(current);
            return;
        }

        if (open < N) {
            generate(result, current + "(", N, open + 1, close);
        }

        if (close < open) {
            generate(result, current + ")", N, open, close + 1);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses generator = new GenerateParentheses();
        int N = 3; // Change this to your desired number of pairs
        List<String> parentheses = generator.generateParenthesis(N);

        // Print the generated balanced parentheses
        for (String parenthesis : parentheses) {
            System.out.println(parenthesis);
        }
    }
}
