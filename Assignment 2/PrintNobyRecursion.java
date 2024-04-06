/* Print 1 to n without using loops */

import java.util.Scanner;
public class PrintNobyRecursion {
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        if (n > 0) {
            printNumbers(n - 1);
        } else {
            printNumbers(n + 1);
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        sc.close();

        printNumbers(n);
    }
}


