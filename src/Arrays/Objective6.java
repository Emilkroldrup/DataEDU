package Arrays;

import java.util.Scanner;

public class Objective6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //A function to return names with 5 or more characters
        System.out.println("How many names you wanna provide? ");
        int num = input.nextInt();
        String[] names = new String[num];
        System.out.println("Enter " + num + " names: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }
        System.out.println("The names with 5 or more char are: ");
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() >= 5) {
                System.out.println(names[i]);
            }
        }

    }
}
