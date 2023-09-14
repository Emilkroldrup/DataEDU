package Loops;

public class LoopsBook2 {
    public static void main(String[] args) {
        System.out.println("Inches\tCentimeters");

        for (int i = 1; i <= 100; i++) {
            double centimeters = i * 2.54;
            System.out.println("  " + i + "\t     " + centimeters);
        }
    }
}
