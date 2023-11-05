package lesson5;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        String article = "Lorem ipsum dolor sit amet, "
                + "consectetur adipiscing elit, #javaforever sed do eiusmod tempor incididunt ut labore "
                + "et dolore magna aliqua. #javaforever #java";
        System.out.println("Индекс последнего появления " +
                "#javaforever: " + article.lastIndexOf("#javaforever"));
    }
}
