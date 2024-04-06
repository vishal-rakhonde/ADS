/* Sum of natural numbers using recursion */

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = sum(n);
            System.out.println("Sum of natural numbers up to " + n + " is: " + result);
        }
    }
}

