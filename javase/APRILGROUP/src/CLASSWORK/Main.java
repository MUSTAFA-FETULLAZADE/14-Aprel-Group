package CLASSWORK;

public class Main {
    public static void main(String[] args) {

        String text = "Java123 is fun 456 and COOL789!";

        boolean hasDigit = text.matches(".*\\d.*");
        System.out.println("Rəqəm varmı: " + hasDigit);

        String noDigits = text.replaceAll("\\d", "");
        System.out.println("Rəqəmlər silindi: " + noDigits);

        String noSpaces = text.replaceAll("\\s", "");
        System.out.println("Boşluqlar silindi: " + noSpaces);

        String replacedDigits = text.replaceAll("\\d", "#");
        System.out.println("Rəqəmlər # ilə əvəz olundu: " + replacedDigits);
    }
}