
public class PalindromeChecker {

    private String content;

    public PalindromeChecker(String content) {
        this.content = normalize(content);
    }

    private String normalize(String input) {
        if (input == null) return "";
        return input.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    public boolean check() {
        if (content.isEmpty()) return true;
        
        int left = 0;
        int right = content.length() - 1;

        while (left < right) {
            if (content.charAt(left) != content.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker("No 'x' in Nixon");

        if (pc.check()) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
}
