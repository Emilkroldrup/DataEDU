package Week2;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = 10;
        int l = 1;
        int range = h - l + 1;
        for (int i = 0; i < 10; i++) {
            int random = (int)(Math.random() * range) + l;

            System.out.println("Give us a number between 1 - 10 ");
            int guess = in.nextInt();

            if (guess == 0) {
                break;
            }
            if (guess == random ) {
                System.out.println("You guessed right! ");
            } else {
                System.out.println("You guessed wrong.. ");
                System.out.println("The correct number was " + random);
            }
            System.out.println("Type in a number again to try your luck or put in 0 to continue ");
        }
    }
}
