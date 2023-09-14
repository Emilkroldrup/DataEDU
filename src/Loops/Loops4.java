package Loops;

import java.util.Scanner;

public class Loops4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String space = " ";

        for (int i = 1; i < 11; i++) {
            int count = number * i;
            System.out.print(count + space);
        }
    }
}
