package ifelse;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Put in 3 numbers ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        Integer[] numbers = new Integer[]{num4, num3, num2, num1};

        Integer min = numbers[0];
        for (Integer number : numbers) {
            if (min > number) {
                min = number;
            }
        }

        Integer max = numbers[0];
        for (Integer number : numbers) {
            if (max < number) {
                max = number;
            }
        }

        System.out.println("Smallest number is " + min);
        System.out.println("Biggest number is " + max);

        Arrays.sort(numbers);
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println(" ");

        Arrays.sort(numbers, Collections.reverseOrder());
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}
