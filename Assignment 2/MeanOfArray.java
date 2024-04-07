/* Mean of Array using Recursion */

import java.util.Scanner;
public class MeanOfArray {
    public static double mean(int[] arr) {
        return sum(arr, arr.length - 1) / (double) arr.length;
    }

    private static int sum(int[] arr, int index) {
        if (index < 0) {
            return 0;
        } else {
            return arr[index] + sum(arr, index - 1);
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
        System.out.println("Mean of the array: " + mean(arr));
        
        sc.close();
    }
}

		