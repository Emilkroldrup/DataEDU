package Loops;

public class LoopsBook1 {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");

        for (int i = 2; i <= 100; i += 2) {
            //Celsius to fahrenheit calculation
            int Fahrenheit = (i * 9 / 5) + 32;
            System.out.println("   " + i + "\t       " + Fahrenheit);
        }
    }
}
