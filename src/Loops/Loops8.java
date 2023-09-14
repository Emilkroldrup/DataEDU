package Loops;

import java.util.Scanner;

public class Loops8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of inputs (x): ");
        int x = scanner.nextInt();
        double[] in = new double[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Enter input " + (i + 1) + ": ");
            in[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < x; i++) {
            sum += in[i];
        }

        double average = 0;
        for (int i = 0; i < x; i++) {
            average = sum/x;
        }

        System.out.println("The sum of all inputs is: " + sum);
        System.out.println("The average of the inputs is: " + average);
    }
}
