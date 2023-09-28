package Arrays;

import java.util.Scanner;

public class Objective7 {
    Scanner scanner = new Scanner(System.in);
    //A function that takes 2 parameters: an array and a number for length of array and returns all even numbers
    public static void evenNumbers(int[] array, int length) {
        System.out.println("Even numbers are: ");
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    //Another function that takes 2 parameters: an array and a number for length of array and returns all odd numbers
    public static void oddNumbers(int[] array, int length) {
        System.out.println("\nOdd numbers are: ");
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        evenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9);
        oddNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9);
    }

}
