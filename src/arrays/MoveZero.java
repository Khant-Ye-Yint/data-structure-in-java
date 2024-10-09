package arrays;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr = new int[]{0,5,4,7,1,0,6,0};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZero(int[] arr) {
        int j = 0,temp;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 && arr[j] == 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if(arr[j] != 0) {
                j++;
            }
        }
    }
}
