package lesson2;

import java.util.Arrays;

public class Task05 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        System.out.print("Зеркальный переворот массива: " + Arrays.toString(arr) + " : ");
        int temp;
        for (int i = 0; i < (arr.length / 2); i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
