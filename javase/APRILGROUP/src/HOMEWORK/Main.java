package HOMEWORK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Onluq ədəd daxil edin: ");
        int sayi = sc.nextInt();


        System.out.println("Binary (2-lik): " + Integer.toBinaryString(sayi));
        

        System.out.println("Octal (8-lik): " + Integer.toOctalString(sayi));
        

        System.out.println("Hexadecimal (16-lıq): " + Integer.toHexString(sayi).toUpperCase());
    }
}
