package Loops;

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        for (int i = 0; i < 21; i++) {
            System.out.println(name);
        }
    }
}
