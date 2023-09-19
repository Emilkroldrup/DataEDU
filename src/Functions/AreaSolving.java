package Functions;

public class AreaSolving {
    static double TriangleArea(double height, double base) {

        return (height * base) / 2;
    }

    static double AreaRectangle(double length, double width) {
        return width * length;
    }
    static double CircumferenceRectangle(double length, double width) {
        double num1 = length * 2;
        double num2 = width * 2;
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println(TriangleArea(3, 5));
        System.out.println(AreaRectangle(3, 5));
        System.out.println(CircumferenceRectangle(3, 5));
    }
}
