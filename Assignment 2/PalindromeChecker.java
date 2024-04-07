/* Recursive function to check if a string is palindrome */

import java.util.Scanner;
public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        return isPalindromeRecursive(str, 0, str.length() - 1);
    }

    private static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base case: when start index crosses or equals the end index
        if (start >= end) {
            return true;
        }
        // If characters at start and end positions don't match, it's not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursively check the substring excluding the start and end characters
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        sc.close();
        
        if (isPalindrome(inputString)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}

