import java.util.Scanner;

public class Opgave3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;  // Bruger max og min value, for at sikre mod at fx 0 ikke vil blive taget som det mindste tal.
        int biggest = Integer.MIN_VALUE;
        int total = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number < smallest) {
                smallest = number;
            }
            if (number > biggest) {
                biggest = number;
            }

            total += number;
            count++;
        }

        double average = count > 0 ? (double) total / count : 0; //Tjekker for division med 0

        System.out.println("The smallest number is: " + smallest);
        System.out.println("The biggest number is: " + biggest);
        System.out.println("The average number is: " + average);
    }
}
