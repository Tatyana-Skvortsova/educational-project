package lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 целых чисел");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] arr1 = Arrays.copyOfRange(arr, 0, 5);
        int[] arr2 = Arrays.copyOfRange(arr, 5, 10);
        System.out.println("Первый массив:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Второй  массив:");
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Первый отсортированный массив:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Второй отсортированный массив:");
        System.out.println(Arrays.toString(arr2));
    }
}
