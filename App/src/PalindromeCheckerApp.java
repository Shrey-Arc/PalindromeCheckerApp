public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Racecar";

        char[] charArray = input.toLowerCase().toCharArray();

        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}
