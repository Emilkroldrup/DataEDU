package Arrays;

import java.util.Scanner;

public class Objective5 {
    public static void main(String[] args) {
        //String array that uses scanner to get input from user and system out print it  out
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter 5 names: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }
        System.out.println("The names are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
