import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Radar";
        String cleanInput = input.toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cleanInput.length(); i++) {
            char c = cleanInput.charAt(i);
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        System.out.println("Comparing FIFO (Queue) vs LIFO (Stack):");
        while (!stack.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();
            System.out.println("Queue: " + fromQueue + " | Stack: " + fromStack);

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("\nInput: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}
