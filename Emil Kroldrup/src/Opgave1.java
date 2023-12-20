import java.util.Scanner;

public class Opgave1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[8];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        System.out.println("The average of the numbers is: " + sum / numbers.length);
    }
}