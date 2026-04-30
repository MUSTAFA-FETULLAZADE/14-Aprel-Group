package CLASSWORK;

import java.util.Scanner;

public class NumberBaseConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Decimal ədəd daxil edin: ");
        int decimal = sc.nextInt();

        String binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        String hex = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Binary (2-lik): " + binary);
        System.out.println("Octal (8-lik): " + octal);
        System.out.println("Hexadecimal (16-lıq): " + hex);

        sc.close();
    }
}
