package lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько элементов будет в массиве? Введите целое число.");
        int count;
        count = scanner.nextInt();
        System.out.println("Вы ввели " + count);
        int[] arr = new int[count];
        System.out.println("Введите " + count + " целых чисел");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Ваш массив выглядит так:");
        System.out.println(Arrays.toString(arr));
        System.out.println("А теперь поменяем первое и последнее число в массиве");
        int temp;
        temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}