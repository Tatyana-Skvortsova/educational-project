package lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
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
        int ind;
        for (int i = 0; i < count; i++) {
            System.out.println("Какой элемент массива вывести? Введите его индекс (от 0 до " + (count - 1) + "):");
            ind = scanner.nextInt();
            if(ind > (count - 1)){
                System.out.println("Такого индекса нет. Введите другое число.");
                continue;
            }
            System.out.println("Под индексом " + ind + " находится число " + arr[ind]);
        }
        System.out.println("Всего доброго!");
    }
}
