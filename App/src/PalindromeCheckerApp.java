import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String input = in.nextLine();
        in.close();

        if(isPalindrome(input)){
            System.out.println("It is a palindrome!");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }

    public static boolean isPalindrome(String s){
        String clean = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int left = 0;
        int right = clean.length() -1;
        while(left<right){
            if(clean.charAt(left) != clean.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
