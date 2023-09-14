package Loops;

public class LoopsBookFinal {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 3;

        for (int i = 0; i < 101; i++) {
            System.out.print(num1 + "/" + num2 + " ");
            num2 +=2;
            num1 +=2;
        }
    }
}
