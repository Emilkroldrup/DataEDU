package ifelse;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

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
    }
}
