package Functions;

public class Objective7 {

    static float CalculateDistance(float x1, float y1, float x2, float y2) {
        float deltaX = x2 - x1;
        float deltaY = y2 - y1;
        //return the formula for distance
        return (float) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static void main(String[] args) {
        System.out.println(CalculateDistance(1, 3, 4, 7));
    }
}
