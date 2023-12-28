package String;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        // Corrected: Create an instance of ValidPalindrome to call the isPalindrome method
        ValidPalindrome vp = new ValidPalindrome();

        // Corrected: Call the isPalindrome method with the corrected string and assign the result
        boolean isPalindrome = vp.isPalindrome(s);

        // Corrected: Print the result
        System.out.println(isPalindrome);
    }

    // Corrected: Make the method static to be called from the main method
    public static boolean isPalindrome(String s) {
        // Transform the input string to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Convert the modified string to a character array for efficient character access
        char[] chars = s.toCharArray();

        // Initialize pointers for comparison
        int i = 0, j = chars.length - 1;

        // Compare characters from both ends towards the middle
        while (i <= j) {

            // If a mismatch is found, the string is not a palindrome
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }

        // If the loop completes without returning false, the string is a palindrome
        return true;
    }
}
