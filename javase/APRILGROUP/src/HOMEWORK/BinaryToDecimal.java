package HOMEWORK;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Binary ədəd daxil edin: ");
        String binaryString = sc.next();

      
        try {
            int decimal = Integer.parseInt(binaryString, 2);
            System.out.println("Onluq qarşılığı: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Səhv: Bu düzgün bir binary ədəd deyil!");
        }
    }
}