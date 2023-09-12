package Week2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class week2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Put in 3 numbers ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        Integer[] numbers = new Integer[]{num3, num2, num1};

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

        System.out.println(" ");

        System.out.println("Put in a year ");
        int year = in.nextInt();
        boolean isLeapYear;

        //check if divisible by 4
        isLeapYear = (year % 4 == 0);

        //divisible by 4, not by 100, or divisible by 400
        isLeapYear = isLeapYear && (year % 100 !=0 || year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

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
        System.out.println("Welcome to the ball club, What is your name?");
        String name = in.next();

        System.out.println("and what is your age?");
        int age = in.nextInt();
        int base = 500;
        int socceradult = base + 1000;
        int soccerkid = base + 550;
        int tennisadult = base + 1500;
        int tenniskid = base + 750;
        int badmintonadult = base + 1250;
        int badmintonkid = base + 600;
        int totalPrice = 0;
        String selectedSports = "";
        String[] activities = new String[] {"Soccer", "Tennis", "Badminton"};

        System.out.println("Available sports:");
        System.out.println("1. Soccer");
        System.out.println("2. Tennis");
        System.out.println("3. Badminton");
        System.out.println("Enter the number(s) of the sports you want to book (comma-separated):");

        String input = in.next();

        String[] choices = input.split(",");

        for (String choice : choices) {
            choice = choice.trim();

            int sportChoice = Integer.parseInt(choice);

            switch (sportChoice) {
                case 1:
                    if (age >= 18) {
                        totalPrice += socceradult;
                    } else {
                        totalPrice += soccerkid;
                    }
                    selectedSports += "Soccer, ";
                    break;
                case 2:
                    if (age >= 18) {
                        totalPrice += tennisadult;
                    } else {
                        totalPrice += tenniskid;
                    }
                    selectedSports += "Tennis, ";
                    break;
                case 3:
                    if (age >= 18) {
                        totalPrice += badmintonadult;
                    } else {
                        totalPrice += badmintonkid;
                    }
                    selectedSports += "Badminton, ";
                    break;
                default:
                    System.out.println("Invalid choice: " + choice);
            }
        }

        selectedSports = selectedSports.trim();
        if (selectedSports.endsWith(",")) {
            selectedSports = selectedSports.substring(0, selectedSports.length() - 1);
        }

        System.out.println("-------------------------------------");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Activities = " + selectedSports );
        System.out.println("Price = " + totalPrice);
        System.out.println("-------------------------------------");
    }


}