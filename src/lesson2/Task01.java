package lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 целых чисел");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int temp;
        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[i] > arr[i + j]) {
                    temp = arr[i + j];
                    arr[i + j] = arr[i];
                    arr[i] =  temp;
                }
            }
        }
        System.out.println("Теперь массив отсортирован!");
        System.out.println(Arrays.toString(arr));
}
}