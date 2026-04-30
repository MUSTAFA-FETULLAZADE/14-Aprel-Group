package HOMEWORK;

import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.println("--- Bitwise Məntiqi Əməliyyatlar ---");
        System.out.print("Birinci ədədi daxil edin (a): ");
        int a = sc.nextInt();
        System.out.print("İkinci ədədi daxil edin (b): ");
        int b = sc.nextInt();

        System.out.println(a + " & " + b + " = " + (a & b) + " (AND)");
        System.out.println(a + " | " + b + " = " + (a | b) + " (OR)");
        System.out.println(a + " ^ " + b + " = " + (a ^ b) + " (XOR)");

        System.out.println("\n-----------------------------------");

        
        System.out.println("--- Bitwise Shift Əməliyyatları ---");
        System.out.print("Ədədi daxil edin (n): ");
        int n = sc.nextInt();
        System.out.print("Shift miqdarını daxil edin (m): ");
        int m = sc.nextInt();

        
        int leftShift = n << m;
       
        int rightShift = n >> m;

        System.out.println(n + " << " + m + " = " + leftShift + " (Sola Shift)");
        System.out.println(n + " >> " + m + " = " + rightShift + " (Sağa Shift)");
        
        sc.close();
    }
}