package Functions;

public class LeapYearV2 {
   public static boolean LeapYear(int year) {
        boolean isLeapYear;

        //check if divisible by 4
        isLeapYear = (year % 4 == 0);

        //divisible by 4, not by 100, or divisible by 400
        isLeapYear = isLeapYear && (year % 100 !=0 || year % 400 == 0);
        return isLeapYear;
    }

    static int CalculateDaysInMonth(int year, int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month. Month must be between 1 and 12.");
        }

        int[] daysInMonthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Adjust for leap year (February has 29 days)
        if (LeapYear(year) && month == 2) {
            return 29;
        }
        return daysInMonthArray[month - 1];
    }

    public static void main(String[] args) {
        System.out.println(LeapYear(2000));
        System.out.println(LeapYear(2001));
        System.out.println(CalculateDaysInMonth(2000, 2));
        System.out.println(CalculateDaysInMonth(2001, 2));
        System.out.println(CalculateDaysInMonth(2000, 13));
    }
}
