package ifelse;
import java.util.Scanner;

public class Ballclub {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
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

