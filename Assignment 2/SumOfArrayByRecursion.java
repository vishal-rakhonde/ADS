/* Sum of array elements using recursion */

import java.util.Scanner;
public class SumOfArrayByRecursion {
    public static int sum(int[] arr) {
        return sumRecursive(arr, arr.length - 1);
    }

    private static int sumRecursive(int[] arr, int index) {
        if (index < 0) {
            return 0;
        } else {
            return arr[index] + sumRecursive(arr, index - 1);
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

        System.out.println("Sum of the array: " + sum(arr));

        sc.close();
    }
}
