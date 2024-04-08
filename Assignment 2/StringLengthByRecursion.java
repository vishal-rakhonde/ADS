/* Program for length of a string using recursion */

import java.util.Scanner;
public class StringLengthByRecursion {
    public static int length(String str) {
        if (str == null || str.equals("")) {
            return 0;
        } else {
            return lengthRecursive(str, 0);
        }
    }

    private static int lengthRecursive(String str, int index) {
        if (index == str.length()) {
            return 0;
        } else {
            return 1 + lengthRecursive(str, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        sc.close();
        
        System.out.println("Length of the string: " + length(inputString));
    }
}
