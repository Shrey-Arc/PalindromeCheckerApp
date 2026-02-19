import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";
        String cleanInput = input.toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cleanInput.length(); i++) {
            stack.push(cleanInput.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        boolean isPalindrome = cleanInput.equals(reversed.toString());

        System.out.println("Original: " + input);
        System.out.println("Popped (Reversed): " + reversed);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}
