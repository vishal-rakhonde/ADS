/* Decimal to binary number using recursion */

import java.util.Scanner;

public class DecimalToBinaryByRecursion {
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else {
            return decimalToBinaryRecursive(decimal, "");
        }
    }

    private static String decimalToBinaryRecursive(int decimal, String binary) {
        if (decimal == 0) {
            return binary;
        } else {
            binary = (decimal % 2) + binary;
            return decimalToBinaryRecursive(decimal / 2, binary);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        sc.close();
        
        System.out.println("Binary equivalent of " + decimal + " is: " + decimalToBinary(decimal));
    }
}
