package Loops;

public class LoopsBook2 {
    public static void main(String[] args) {
        System.out.println("Inches\tCentimeters");
        double InchesToCentimetersMultiplier = 2.54;

        for (int i = 1; i <= 100; i++) {
            double centimeters = i * InchesToCentimetersMultiplier;
            System.out.println("  " + i + "\t     " + centimeters);
        }
    }
}
