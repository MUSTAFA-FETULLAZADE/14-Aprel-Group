package HOMEWORK;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.time.format.DateTimeParseException;

public class RegexTasksFull {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Bir string daxil edin: ");
        String input = sc.nextLine();

        boolean isOnlyDigits = input.matches("^\\d+$");
        System.out.println(input + " → " + isOnlyDigits);

      
        System.out.print("Tarix daxil edin (dd-mm-yyyy): ");
        String dateInput = sc.nextLine();

     
        String dateRegex = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}$";

        if (dateInput.matches(dateRegex)) {

           
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("dd-MM-uuuu")
                                     .withResolverStyle(ResolverStyle.STRICT);

            try {
                LocalDate.parse(dateInput, formatter);
                System.out.println(dateInput + " → true");
            } catch (DateTimeParseException e) {
                System.out.println(dateInput + " → false");
            }

        } else {
            System.out.println(dateInput + " → false");
        }

        sc.close();
    }
}