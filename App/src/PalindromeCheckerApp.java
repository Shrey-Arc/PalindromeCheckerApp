/** @author Shrey-Arc */
public class PalindromePerformance {

    public static void comparePerformance(String testString) {
        String clean = testString.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        System.out.println("Testing String Length: " + clean.length());
        System.out.println("-------------------------------------------");

        // 1. Test Deque Strategy
        long startTime = System.nanoTime();
        new DequeStrategy().isPalindrome(clean);
        long endTime = System.nanoTime();
        System.out.println("Deque Strategy:  " + (endTime - startTime) + " ns");

        // 2. Test Stack Strategy
        startTime = System.nanoTime();
        new StackStrategy().isPalindrome(clean);
        endTime = System.nanoTime();
        System.out.println("Stack Strategy:  " + (endTime - startTime) + " ns");

        // 3. Test Simple Two-Pointer (Array)
        startTime = System.nanoTime();
        checkSimple(clean);
        endTime = System.nanoTime();
        System.out.println("Simple Pointer:  " + (endTime - startTime) + " ns");
    }

    private static boolean checkSimple(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Test with a very long string to see a real difference
        String longString = "a".repeat(10000) + "b" + "a".repeat(10000);
        comparePerformance(longString);
    }
}
