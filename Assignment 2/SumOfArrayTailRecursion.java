/* Tail recursion to calculate sum of array elements. */

import java.util.Scanner;
public class SumOfArrayTailRecursion {
    public static int sum(int[] arr) {
        return sumTailRecursive(arr, 0, 0);
    }

    private static int sumTailRecursive(int[] arr, int index, int currentSum) {
        if (index == arr.length) {
            return currentSum;
        } else {
            return sumTailRecursive(arr, index + 1, currentSum + arr[index]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Sum of the array: " + sum(arr));
    }
}
