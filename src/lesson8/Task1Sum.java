package lesson8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1Sum {
    public static void main(String[] args) {
        //Task1 -  Посчитать среднее значение листа интеджеров.
        System.out.println("Задача 1 - Посчитать среднее значение листа интеджеров.");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(list);

      double sum = list.stream()
              .mapToInt(x -> x)
              .average()
              .orElse(0);
       System.out.println(sum);

       //Task2 - Преобразовать лист строк вверхний и нижний регист, используя стримы.
        System.out.println("Задача 2 - Преобразовать лист строк вверхний и нижний регист, используя стримы.");
        List<String> elements1 = Stream.of("ONE", "TWO", "THREE")
                .map(String::toLowerCase)
                .toList();
        System.out.println(elements1);

        List<String> elements = elements1.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(elements);

        //Task3 -Посчитать сумму всех четных и нечетных элементов листа

        //Task4 -Убрать все дублирующиеся элементы из листа используя стримы.
        System.out.println("Задача 4 - Убрать все дублирующиеся элементы из листа используя стримы.");
        System.out.println(list);
        List<Integer> listTask4 = list.stream()
                .distinct()
                .toList();
        System.out.println(listTask4);

        //Task5 - Посчитать количество строк в стриме, которые начинаются с определенного символа
        System.out.println("Задача 5 - Посчитать количество строк в стриме, которые начинаются с определенного символа");
        List<String> str = Arrays.asList("Apple", "Pineapple", "Pear", "Orange");
        System.out.println(str);

        long count = str.stream().filter(s -> s.startsWith("P")).count();
        System.out.println(count);

        //Task6 - Отсортировать лист строк в алфавитном порядке и в убывающем.
        System.out.println("Задача 6 - Отсортировать лист строк в алфавитном порядке и в убывающем.");
        List<String> strSotred = str.stream()
                .sorted()
                .collect(Collectors.toList());;
        System.out.println(strSotred);

        strSotred = str.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());;
        System.out.println(strSotred);

        //Task7 - Из листа строк получить числа, затем найти максимум и минимум
        System.out.println("Задача 7 - Из листа строк получить числа, затем найти максимум и минимум");
        List<String> strInt = Arrays.asList("1", "2", "3", "4");
        System.out.println(strInt);
        Integer num = strInt.stream()
                .map(Integer::parseInt)
                .reduce(Integer::max).get();
        System.out.println("Max: " + num);
        num = strInt.stream()
                .map(Integer::parseInt)
                .reduce(Integer::min).get();
        System.out.println("Min: " + num);

        //Task8 -  Найти второй самый маленький и самый большой элементы в листе интеджеров
    }
}
