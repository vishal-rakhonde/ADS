/*Write a Java Program to check whether the given number is Perfect Number or NOT. */
import java.util.Scanner;

public class PerfectNumber {
    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a perfect number or not:");
        int number = scanner.nextInt();
        if (isPerfect(number))
            System.out.println(number + " is a perfect number.");
        else
            System.out.println(number + " is not a perfect number.");

        scanner.close();
    }
}
