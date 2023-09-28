package Arrays;

public class Objective2 {
    //the function takes in 2 parameters and returns the average of the array
    public static double average(int[] array, int length){
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += array[i];
        }
        return sum/length;
    }

    public static void main(String[] args) {
        System.out.println(average(new int[]{1,2,3,4,5,6,7,8,9,10}, 10));
    }
}
