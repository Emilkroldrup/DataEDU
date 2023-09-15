package ifelse;

import java.util.Scanner;

public class LetterService {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Give us the weight of the letter in g ");
        int weight = in.nextInt();
        System.out.println("Now we need to know if you want it quick (only in Denmark) or just normal tax");
        System.out.println("Type in the number you want");
        System.out.println("1: Quick letter");
        System.out.println("2: Normal tax inside Denmark");
        System.out.println("3: Normal tax outside of Denmark");
        int tax = in.nextInt();

        if (tax == 1) {
            if (weight < 100) {
                System.out.println("As the weight is under 100 g, this quick letter will cost 32.00 DKK ");
            } else if ( weight > 100 && weight < 250) {
                System.out.println("As the weight is between 100 and 250 g, this quick letter will cost 64.00 DKK ");
            } else {
                System.out.println("As the weight is above 250 g, this quick letter will cost 96.00 DKK ");
            }
        }
        if (tax == 2) {
            if (weight < 50){
                System.out.println("As the weight is under 50 g, this letter in Denmark will cost 12.00 DKK ");
            } else if (weight < 100 && weight > 50) {
                System.out.println("As the weight is between 50 and 100 g, this letter in Denmark will cost 24.00 DKK ");
            } else if ( weight > 100 && weight < 250) {
                System.out.println("As the weight is between 100 and 250 g, this letter in Denmark will cost 48.00 DKK ");
            } else {
                System.out.println("As the weight is above 250 g, this letter in Denmark will cost 60.00 DKK ");
            }
        }
        if (tax == 3) {
            if (weight < 50){
                System.out.println("As the weight is under 50 g, this letter outside Denmark will cost 36.00 DKK ");
            } else if (weight < 100 && weight > 50) {
                System.out.println("As the weight is between 50 and 100 g, this letter outside Denmark will cost 36.00 DKK ");
            } else if ( weight > 100 && weight < 250) {
                System.out.println("As the weight is between 100 and 250 g, this letter outside Denmark will cost 72.00 DKK ");
            } else {
                System.out.println("As the weight is above 250 g, this letter outside Denmark will cost 96.00 DKK ");
            }
        }
    }
}
