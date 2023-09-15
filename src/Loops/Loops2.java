package Loops;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int alder = in.nextInt();

        for (int i = 1; i < 16; i++) {
            System.out.println(i + ": Your name is " + name + " and your age is " + alder);
        }
    }
}
