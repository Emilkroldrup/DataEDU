package Dices;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Yatzy {

    private Raflebaeger raflebaeger;
    private Map<String, Integer> scoreCard;

    public Yatzy() {
        raflebaeger = new Raflebaeger();
        scoreCard = new HashMap<>();
        initializeScoreCard();
    }

    public void addDie(Terning die) {
        raflebaeger.tilfoej(die);
    }

    private void initializeScoreCard() {
        // Add all Yatzy categories to the score card with an initial score of -1 (not scored yet)
        String[] categories = {"Ones", "Twos", "Threes", "Fours", "Fives", "Sixes", "Three of a kind", "Four of a kind", "Full house", "Small straight", "Large straight", "Chance", "Yatzy"};
        for (String category : categories) {
            scoreCard.put(category, -1);
        }
    }

    public String chooseCategory() {
        System.out.println("Choose a category to score:");
        for (String category : scoreCard.keySet()) {
            if (scoreCard.get(category) == -1) {
                System.out.println(category);
            }
        }
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (scoreCard.containsKey(choice) && scoreCard.get(choice) == -1) {
            return choice;
        } else {
            System.out.println("Invalid choice, please choose a different category");
            return chooseCategory();
        }
    }

    public void playRound() {
        // Roll the dice
        raflebaeger.ryst();

        // Print the result of the dice roll
        raflebaeger.udskrivindhold();

        // Let the player choose a category to score
        String category = chooseCategory();
        int score = calculateScore(category);
        scoreCard.put(category, score);

        // Print the score for this round
        System.out.println("Scored " + score + " points in the " + category + " category");
    }

    private int calculateScore(String category) {
        int[] diceValues = new int[6];
        int score = 0;

        // Count the occurrences of each dice value
        for (Terning terning : raflebaeger.getTerninger()) {
            diceValues[terning.getVaerdi() - 1]++;
        }

        switch (category) {
            case "Ones":
                score = diceValues[0];
                break;
            case "Twos":
                score = 2 * diceValues[1];
                break;
            case "Threes":
                score = 3 * diceValues[2];
                break;
            case "Fours":
                score = 4 * diceValues[3];
                break;
            case "Fives":
                score = 5 * diceValues[4];
                break;
            case "Sixes":
                score = 6 * diceValues[5];
                break;
            case "Three of a kind":
                for (int i = 0; i < 6; i++) {
                    if (diceValues[i] >= 3) {
                        score = (i + 1) * 3;
                    }
                }
                break;
            case "Four of a kind":
                for (int i = 0; i < 6; i++) {
                    if (diceValues[i] >= 4) {
                        score = (i + 1) * 4;
                    }
                }
                break;
            case "Full house":
                boolean threeOfAKind = false;
                boolean pair = false;
                for (int i = 0; i < 6; i++) {
                    if (diceValues[i] == 3) {
                        threeOfAKind = true;
                    } else if (diceValues[i] == 2) {
                        pair = true;
                    }
                }
                if (threeOfAKind && pair) {
                    score = 25;
                }
                break;
            case "Small straight":
                if ((diceValues[0] == 1 && diceValues[1] == 1 && diceValues[2] == 1 && diceValues[3] == 1) ||
                        (diceValues[1] == 1 && diceValues[2] == 1 && diceValues[3] == 1 && diceValues[4] == 1) ||
                        (diceValues[2] == 1 && diceValues[3] == 1 && diceValues[4] == 1 && diceValues[5] == 1)) {
                    score = 30;
                }
                break;
            case "Large straight":
                if ((diceValues[0] == 1 && diceValues[1] == 1 && diceValues[2] == 1 && diceValues[3] == 1 && diceValues[4] == 1) ||
                        (diceValues[1] == 1 && diceValues[2] == 1 && diceValues[3] == 1 && diceValues[4] == 1 && diceValues[5] == 1)) {
                    score = 40;
                }
                break;
            case "Chance":
                for (int i = 0; i < 6; i++) {
                    score += (i + 1) * diceValues[i];
                }
                break;
            case "Yatzy":
                for (int i = 0; i < 6; i++) {
                    if (diceValues[i] == 5) {
                        score = 50;
                    }
                }
                break;
            default:
                System.out.println("Invalid category");
                break;
        }
        return score;
    }

    public void printFinalScore() {
        System.out.println("Final Score:");
        int totalScore = 0;
        for (Map.Entry<String, Integer> entry : scoreCard.entrySet()) {
            String category = entry.getKey();
            int score = entry.getValue();
            System.out.println(category + ": " + (score == -1 ? "Not scored" : score));
            if (score != -1) {
                totalScore += score;
            }
        }
        System.out.println("Total Score: " + totalScore);
    }
}
