package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class SortArr {

    public static void sort(int[] arr, int low, int high) {

        if (low >= high) return; //закончить выполнение программы, если не осталось частей, которые нужно разделить

        int middle = (high - low) / 2 + low; //середина части
        int select = arr[middle]; //значение середины

        int l = low;
        int h = high;

        while (l <= h) {
            //движемся вправо и влево, пока значения не будут больше (слева) и меньше (справа)
            while (arr[l] < select) l++;
            while (arr[h] > select) h--;

            // меняем местами значения, если большее слева, а меньшее справа
            if (l <= h) {
                int temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
                l++;
                h--;
            }
        }

        // повторяем метод с левой и правой частями (рекурсия)
        if (low < h)
            sort(arr, low, h);
        if (high > l)
            sort(arr, l, high);
    }

    public static void main(String[] args) {
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

        sort(arr, 0, arr.length - 1);
        System.out.println("Теперь массив отсортирован методом быстрой сортировки");
        System.out.println(Arrays.toString(arr));
    }
}
