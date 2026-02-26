public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "madam";
        boolean result = isPalindrome(input.toLowerCase(), 0, input.length() - 1);
        
        System.out.println("Is '" + input + "' a palindrome? " + result);
    }
}
