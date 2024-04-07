/* Print reverse of a string using recursion */

import java.util.Scanner;

public class RevStringByRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        sc.close();
        
        System.out.println(recursionRev(s));
    }

    private static String recursionRev(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return recursionRev(s.substring(1)) + s.charAt(0);
    }
}
