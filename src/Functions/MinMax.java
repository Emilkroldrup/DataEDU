package Functions;

public class MinMax {

    static int min(int x, int y) {
        if (x < y) {
            return x;
        } else
            return y;
    }

    //Or we can do it my way
    static int minE(int x, int y) {
        return Math.min(x, y);
    }

    //And now for max
    static int max(int x, int y) {
        if (x > y) {
            return x;
        } else
            return y;
    }

    //Or we can do it my way
    static int maxE(int x, int y) {
        return Math.max(x, y);
    }

    //Same thing again, just with 1 more input and I am lazy, so only gonna be my way cuz :)

    static int max3(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }
    static int min3(int x, int y, int z) {
        return Math.min(x, Math.min(y, z));
    }
    //Again could have been done more easily with the use of Arrays, but that is not allowed for this assignment.

    public static void main(String[] args) {
        System.out.println(min(3, 5));
        System.out.println(minE(3, 5));
        System.out.println(max(3, 5));
        System.out.println(maxE(3, 5));
        System.out.println(max3(3, 5, 11));
        System.out.println(min3(3, 5, 11));
    }
}
