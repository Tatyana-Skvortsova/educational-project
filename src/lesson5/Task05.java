package lesson5;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль из 5 символов латинского алфавита или цифр: ");
        String password = scanner.nextLine();
        while (!password.matches("^[a-zA-Z0-9]{5}$") ) {
            System.out.println("Строка должна состоять из 5 латинских букв или цифр");
            password = scanner.nextLine();
        }
        StringBuilder builderPassword = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLetter(c))
                builderPassword.append((int)c);
            if (Character.isDigit(c))
                builderPassword.append(Character.getNumericValue(c) + 1);
        }
        System.out.println("Зашифрованный пароль: " + builderPassword);
    }
}