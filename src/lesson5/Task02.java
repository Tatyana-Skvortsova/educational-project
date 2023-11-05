package lesson5;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String input = scanner.nextLine();
        System.out.println("Введите второе имя:");
        String input2 = scanner.nextLine();

        if (input.equals(input2)) {
            System.out.println("Поздравляю, вы тезки!");
        }
        else
            System.out.println("К сожалению, вы не тезки...");
    }
}
