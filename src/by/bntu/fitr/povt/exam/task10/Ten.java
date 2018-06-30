package by.bntu.fitr.povt.exam.task10;
import java.util.Random;

public class Ten {
    public static void main() {
        int[] array = new int[10];
        Random rnd = new Random();
        for(int i =0; i<array.length; i++){
            array[i] = rnd.nextInt(50);

        }
        System.out.println("Before: "+ java.util.Arrays.toString(array));
        sort(array);
        System.out.println("After: "+java.util.Arrays.toString(array));
    }
    public static int[] sort(int[] arr){
        for (int min = 0; min < arr.length - 1; min++) {
            int k = min;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            int b = arr[min];
            arr[min] = arr[k];
            arr[k] = b;
        }
        return arr;
    }
}