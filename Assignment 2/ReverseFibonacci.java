/* Print Fibonacci Series in reverse order using Recursion */

import java.util.Scanner;
public class ReverseFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Reverse Fibonacci Series:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
