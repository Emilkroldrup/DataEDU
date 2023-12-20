import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Opgave4 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\EmilK\\Desktop\\Programming test\\Emil Krøldrup\\src\\input.txt");
            Scanner scanner = new Scanner(file);

            int smallest = Integer.MAX_VALUE;
            int biggest = Integer.MIN_VALUE;
            int total = 0;
            int count = 0;

            // Denne kører dog kun, hvis det er en int i documentet og intet andet, hvilket passer til opgaven, men kan bygges mere robust overfor flere ting.
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                smallest = Math.min(smallest, number);
                biggest = Math.max(biggest, number);
                total += number;
                count++;
            }
            double average = count > 0 ? (double) total / count : 0;

            System.out.println("The smallest number is: " + smallest);
            System.out.println("The biggest number is: " + biggest);
            System.out.println("The average number is: " + average);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
