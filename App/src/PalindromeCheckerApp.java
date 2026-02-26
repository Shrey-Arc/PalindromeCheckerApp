public class PalindromeCheckerApp {

    public static String normalize(String input) {
        if (input == null) return "";

        return input.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    public static void main(String[] args) {
        String rawInput = "A man, a plan, a canal: Panama";
        String clean = normalize(rawInput);
        
        System.out.println("Original: " + rawInput);
        System.out.println("Normalized: " + clean);
        
    }
}
