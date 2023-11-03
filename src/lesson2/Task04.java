package lesson2;

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 6, 4};
        double mean = 0;
        for (double d : arr) {
            mean += d;
        }
        mean = mean / arr.length;
        System.out.println("Среднее арифметическое массива " + Arrays.toString(arr) + " = " + mean);
    }
}
