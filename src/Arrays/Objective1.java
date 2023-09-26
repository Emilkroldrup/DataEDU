package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Objective1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number " + (i + 1) + " is " + array[i]);
        }

        //A for loop to add int 2 to each element in the array
        for (int i = 0; i < array.length; i++) {
            array[i] += 2;
            System.out.println("Number with " + (i + 1) + " with +2 is " + array[i]);
        }

        System.out.println('\n');
        //find average and print it out
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println('\n');
        System.out.println("The average of the array is " + sum / array.length);

        //find the max value in the array
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("The max value in the array is " + max);
        //This is the same thing as above but using the Math.max method
        Arrays.sort(array);
        System.out.println(Math.max(array[0], array[array.length-1]));


        //find the min value in the array
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("The min value in the array is " + min);
        //This is the same thing as above but using the Math.min method
        Arrays.sort(array);
        System.out.println(Math.min(array[0], array[array.length-1]));

    }
}
