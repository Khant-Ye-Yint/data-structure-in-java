package arrays;

public class Resize {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,6};
        System.out.println(arr.length);
        arr = resize(arr,8);
        System.out.println(arr.length);
    }

    public static int[] resize (int[] arr,int capicity) {
        int[] temp = new int[capicity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
}
