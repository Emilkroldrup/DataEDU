import java.util.Random;
import java.util.Scanner;

public class Loops12_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of math objectives: ");
        int numObjectives = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.nextLine().charAt(0);

        int correctAnswers = 0;
        int failedAnswers = 0;

        for (int i = 0; i < numObjectives; i++) {
            int operand1 = random.nextInt(100);
            int operand2 = random.nextInt(100);
            double result = 0.0;

            switch (operator) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    if (operand2 != 0) {
                        result = (double) operand1 / operand2;
                    } else {
                        System.out.println("Division by zero! Skipping this objective.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please enter +, -, *, or /.");
                    return;
            }

            System.out.print("Objective " + (i + 1) + ": " + operand1 + " " + operator + " " + operand2 + " = ");
            double userAnswer = scanner.nextDouble();

            if (Math.abs(userAnswer - result) < 0.001) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + result);
                failedAnswers++;
            }
        }

        System.out.println("Quiz Summary:");
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Incorrect Answers: " + failedAnswers);
    }
}
