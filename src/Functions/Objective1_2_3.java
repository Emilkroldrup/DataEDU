package Functions;

public class Objective1_2_3 {
    static void print(String word, int number) {
        for (int i = 1; i < number + 1; i++) {
            System.out.println(i + " " + word);
        }
    }

    public static void main(String[] args) {
        print("programming", 10);
    }
}
