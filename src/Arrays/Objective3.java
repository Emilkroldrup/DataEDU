package Arrays;

public class Objective3 {
    //A function to find the minimum value in an array
    public static int minimum(int[] array, int length){
        int min = array[0];
        for (int i = 0; i < length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minimum(new int[]{1,2,3,4,5,6,7,8,9,10}, 10));
    }
}
