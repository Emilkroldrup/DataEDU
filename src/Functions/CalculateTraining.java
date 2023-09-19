package Functions;

import java.util.Random;
import java.util.Scanner;

    public class CalculateTraining {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of math objectives: ");
            int numObjectives = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.nextLine().charAt(0);

            int[] results = performMathQuiz(numObjectives, operator);

            System.out.println("Quiz Summary:");
            System.out.println("Correct Answers: " + results[0]);
            System.out.println("Incorrect Answers: " + results[1]);
            }

            public static int[] performMathQuiz(int numObjectives, char operator) {
                Random random = new Random();
                int correctAnswers = 0;
                int failedAnswers = 0;

                for (int i = 0; i < numObjectives; i++) {
                    int operand1 = random.nextInt(100);
                    int operand2 = random.nextInt(100);
                    double result = calculateResult(operator, operand1, operand2);

                    System.out.print("Objective " + (i + 1) + ": " + operand1 + " " + operator + " " + operand2 + " = ");
                    double userAnswer = getUserAnswer();

                    if (Math.abs(userAnswer - result) < 0.001) {
                        System.out.println("Correct!");
                        correctAnswers++;
                    } else {
                        System.out.println("Incorrect! The correct answer is: " + result);
                        failedAnswers++;
                    }
                }

                    return new int[]{correctAnswers, failedAnswers};
            }

            public static double calculateResult(char operator, int operand1, int operand2) {
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
                }
                break;
                default:
                System.out.println("Invalid operator! Please enter +, -, *, or /.");
                System.exit(1); // Exit the program
            }
                return result;
            }

            public static double getUserAnswer() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        }
    }

