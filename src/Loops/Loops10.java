package Loops;

import java.util.Scanner;

public class Loops10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of inputs (x): ");
        int x = scanner.nextInt();
        double[] in = new double[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Enter input " + (i + 1) + ": ");
            in[i] = scanner.nextDouble();
            if (in[i] == 0) {
                break;
            }
        }

        double sum = 0;
        for (int i = 0; i < x; i++) {
            if (in[i] > 5) {
                sum += in[i];
            }
        }

        System.out.println("The sum of all inputs above 5 is: " + sum);
    }
    }

