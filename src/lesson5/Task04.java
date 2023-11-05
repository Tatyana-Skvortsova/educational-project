package lesson5;

public class Task04 {
    public static void main(String[] args) {
        String str = "Иванов Иван Иванович";
        String old = "Иван";
        String fresh = "Петр";
        System.out.println("Было: " + str);
        System.out.println("Стало: " + str.replace(old, fresh));
    }
}
