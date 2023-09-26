package Arrays;

public class Objective4 {
    //A function to find the maximum value in an array
    public static int maximum(int[] array, int length){
        int max = array[0];
        for (int i = 0; i < length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximum(new int[]{1,2,3,4,5,6,7,8,9,10}, 10));
    }
}
