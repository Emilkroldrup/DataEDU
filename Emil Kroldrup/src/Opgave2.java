import java.util.Scanner;

public class Opgave2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest = 0;
        while (true) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("The smallest number is: " + smallest);
    }
}
