package CLASSWORK;

import java.util.Scanner;

public class BaseToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Binary ədəd daxil edin: ");
        String binaryInput = sc.nextLine().trim();

        int decimalFromBinary = Integer.parseInt(binaryInput, 2);
        System.out.println("Decimal nəticə (binary-dən): " + decimalFromBinary);


        System.out.print("Hexadecimal ədəd daxil edin: ");
        String hexInput = sc.nextLine().trim();

        int decimalFromHex = Integer.parseInt(hexInput, 16);
        System.out.println("Decimal nəticə (hex-dən): " + decimalFromHex);

        sc.close();
    }
}