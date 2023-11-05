package lesson5;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        if (input.length() > 2) {
            StringBuilder builder = new StringBuilder();
            builder.append(input.charAt(0));
            for (int i = 1; i < input.length() - 1; i++) {
                builder.append("*");
            }
            builder.append(input.charAt(input.length() - 1));
            System.out.println("Результат: " + builder);
        }
        else  System.out.println("Результат: " + input);
    }
}