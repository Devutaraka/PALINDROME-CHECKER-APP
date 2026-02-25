public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Declare and initialize input string
        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}