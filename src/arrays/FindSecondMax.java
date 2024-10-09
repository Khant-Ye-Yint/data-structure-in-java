package arrays;

public class FindSecondMax {
    public static void main(String[] args) {
        int[] arr = new int[]{34,12,38,12,56,30};
        int result = findSecondMax(arr);
        System.out.println(result);
    }

    public static int findSecondMax (int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                min = max;
                max = arr[i];
            }

            if(arr[i] > min && arr[i] != max) {
                min = arr[i];
            }
        }

        return min;
    }
}
