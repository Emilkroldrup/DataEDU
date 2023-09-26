package Arrays;

import java.util.Scanner;

public class SortingShow {
    static Scanner scanner = new Scanner(System.in);

    public static int[] inputNumber() {
        //I need this to push the data into the array
        System.out.println("Give us how many numbers you want to input: ");
        int input = scanner.nextInt();
        int[] array = new int[input];
        System.out.println("Give us the numbers: ");
        for (int i = 0; i < input; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1; // Now high < low
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }






    public static void main(String[] args) {
        int[] numbers = inputNumber();

        System.out.println("Original numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        selectionSort(numbers);
        System.out.println("Numbers after Selection Sort:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Enter the number you want to search for:");
        int searchNumber = scanner.nextInt();

        System.out.println("Linear Search Result: " + linearSearch(numbers, searchNumber));
        System.out.println("Binary Search Result: " + binarySearch(numbers, searchNumber));
    }
 }


