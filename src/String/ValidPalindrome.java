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
        // Corrected: Assign the result of toLowerCase() and replaceAll() back to the string
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int i = 0, j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
