package Loops;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            String space = " ";
            int number = 5 * i;
            System.out.print(number + space);
        }

        System.out.println(" ");

        int count = 1;
        while (count < 11) {
            String space = " ";
            int number = 5 * count;
            System.out.print(number + space);
            count++;
        }

    }
}
