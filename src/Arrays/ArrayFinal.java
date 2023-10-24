package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFinal {
    //Finish the functions below so that main works
    public static void main(String[] args) {
        int[][] table = new int[3][4];
        inputData(table);
        PrintData(table);
        System.out.println('\n');
        int sum = sumTable(table);

        int RowWithLowestValue = RowMinSum(table);
        int RowWithHighestValue = RowMaxSum(table);
        System.out.println("Sum of rows is: " + sum);
        System.out.println('\n');
        System.out.println("Row with the smallest sum is: " + RowWithLowestValue);
        System.out.println('\n');
        System.out.println("Row with the highest sum is: " + RowWithHighestValue);
        System.out.println('\n');

        int[] TableRowSum = RowSum(table);
        System.out.println("Row Sums:");
        for (int i = 0; i < TableRowSum.length; i++) {
            System.out.println("Row " + i + " Sum: " + TableRowSum[i]);
        }
        System.out.println('\n');
        sumColumns(table);
    }

    //Function need to read 12 integers in the 2-dimensional array a with 4 rows and 3 columns
    public static void inputData(int[][] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give us the numbers: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
    }

    //Function prints the value of array a
    public static void PrintData(int[][] a) {
        System.out.println("Array Values:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "\t"); // Use tabs to separate values
            }
            System.out.println(); // Move to the next row
        }
    }

    //Function returns the sum of all the values in the array a
    public static int sumTable(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 3; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }


    //Function returns the row number of the row with the smallest sum
    public static int RowMinSum(int[][] a) {
        int MinRow = 0;
        int min = sumRow(a, 0); // Initialize min with the sum of the first row

        for (int i = 1; i < a.length; i++) {
            int currentSum = sumRow(a, i);
            if (currentSum < min) {
                min = currentSum;
                MinRow = i;
            }
        }
        return MinRow;
    }

    //Function returns the row number of the row with the largest sum
    public static int RowMaxSum(int[][] a) {
        int MaxRow = 0;
        int max = sumRow(a, 0); // Initialize max with the sum of the first row

        for (int i = 1; i < a.length; i++) {
            int currentSum = sumRow(a, i);
            if (currentSum > max) {
                max = currentSum;
                MaxRow = i;
            }
        }
        return MaxRow;
    }

    public static int[] RowSum(int[][] a) {
        int[] rowSums = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            rowSums[i] = sumRow(a, i);
        }
        return rowSums;
    }

    public static int sumRow(int[][] a, int row) {
        int sum = 0;
        for (int j = 0; j < a[row].length; j++) {
            sum += a[row][j];
        }
        return sum;
    }

    public static void sumColumns(int[][] a) {
        int numRows = a.length;
        int numCols = a[0].length;

        System.out.println("Column Sums:");
        for (int j = 0; j < numCols; j++) {
            int columnSum = 0;
            for (int i = 0; i < numRows; i++) {
                columnSum += a[i][j];
            }
            System.out.println("Column " + j + " Sum: " + columnSum);
        }
    }

}

