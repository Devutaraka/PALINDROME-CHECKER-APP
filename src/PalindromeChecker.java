public class PalindromeChecker {

    public static void main(String[] args) {
        String word = "madam";

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
