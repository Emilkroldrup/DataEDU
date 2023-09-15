package Loops;

import java.util.Scanner;

public class Loops6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of inputs (x): ");
        int x = in.nextInt();
        double[] numbers = new double[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Enter input " + (i + 1) + ": ");
            numbers[i] = in.nextDouble();
        }

        double min = numbers[0];
        for (double number : numbers) {
            if (min > number) {
                min = number;
            }
        }

        double max = numbers[0];
        for (double number : numbers) {
            if (max < number) {
                max = number;
            }
        }

        System.out.println("Smallest number is " + min);
        System.out.println("Biggest number is " + max);
    }
}
