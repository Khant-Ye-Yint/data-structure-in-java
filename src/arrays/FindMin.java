package arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = new int[]{4,4,6,7,9};
        int min = findMinimum(arr);
        System.out.println(min);
    }

    public  static int findMinimum (int[] arr) {

        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int min = arr[0];
        for (int i = 1 ; i < arr.length ; i++) {
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
}
